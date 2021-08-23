# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

# This script automates the patch release process for a given library.
# Note that this assumes that the only changes needed in the patch are upgrades to the dependencies.
# It makes all the necessary changes and pushes them in an upstream branch which can then be used to trigger the release
# Please follow the necessary steps for the release - validating all the changes, trigger the release pipeline, approve the release etc.
# It takes in the following arguments
# The script takes the following arguments
# 1. ArtifactName - Name of the library that needs to be patched. This is a required parameter.
# 2. ServiceDirectoryName - The directory name under 'sdk' folder where the source code of the library is present. This is a required parameter.
# 3. ReleaseVersion - The latest release version of the library which is to be patched. This is a required parameter.
# 4. PatchVersion - The version of the patch. This is a required parameter.
#                   TODO: We can remove the need for this parameter by intepreting this from the first version.
# 5. BranchName - The name of the remote branch where the changes will be pushed. We push the changes to the 'upstream remote'. This is not a required parameter.
#                 In case the argument is not provided the branch name is release/{ArtifactName}.
#
# Example:  .\eng\scripts\Generate-Patch.ps1 -ArtifactName azure-mixedreality-remoterendering -ServiceDirectory remoterendering -ReleaseVersion 1.0.0 -PatchVersion 1.0.1
# This creates a remote branch "release/azure-mixedreality-remoterendering" with all the necessary changes.

param(
  [Parameter(Mandatory=$true)][string]$ArtifactName,
  [Parameter(Mandatory=$true)][string]$ServiceDirectoryName,
  [Parameter(Mandatory=$true)][string]$ReleaseVersion,
  [Parameter(Mandatory=$true)][string]$PatchVersion,
  [Parameter(Mandatory=$false)][string]$BranchName
)

function TestPathThrow($Path) {
  if(!(Test-Path $Path)) {
   LogError "$Path not found"
   exit
  }
}

Write-Information "PS Script Root is: $PSScriptRoot"
Write-Information "ArtifactName is: $ArtifactName"
Write-Information "ReleaseVersion is: $ReleaseVersion"
Write-Information "ServiceDirectoryName is: $ServiceDirectoryName"
Write-Information "PatchVersion is: $PatchVersion"

if($null -eq $BranchName) {
  $BranchName = "release/$artifactName.ToLower()"
}
Write-Information "BranchName is: $branchName"

$RepoRoot = Resolve-Path "${PSScriptRoot}..\..\.."
$EngDir = Join-Path $RepoRoot "eng"
$EngCommonScriptsDir = Join-Path $EngDir "common" "scripts"
$SdkDirPath = Join-Path $RepoRoot "sdk"
$ServiceDirPath = Join-Path $SdkDirPath $ServiceDirectoryName
$ArtifactDirPath = Join-Path $ServiceDirPath $ArtifactName
$ArtifactPomFile = Join-Path $ArtifactDirPath "pom.xml"
$ReleaseTag = -join($ArtifactName, "_", $ReleaseVersion)
$TestResourcesFilePath = Join-Path $ServiceDirPath "test-resources.json"
$GroupId = "com.azure"

TestPathThrow -Path $ArtifactDirPath
TestPathThrow -Path $EngDir
TestPathThrow -Path $EngCommonScriptsDir
TestPathThrow -Path $ArtifactDirPath
TestPathThrow -Path $ArtifactPomFile
TestPathThrow -Path $SdkDirPath

## Creating a new branch
git checkout -b $BranchName upstream/main

try {
  ## Hard reseting it to the contents of the release tag.
  ## Fetching all the tags from the upstream branch
  $CmdOutput = git fetch upstream --tags
  $cmdOutput = git restore --source $ReleaseTag -W -S $ArtifactDirPath
  if($LASTEXITCODE -ne 0) {
    LogError "Could not restore the changes for release tag $ReleaseTag"
    exit
  }

  if(Test-Path $TestResourcesFilePath) {
    $cmdOutput = git restore --source $ReleaseTag -W -S $TestResourcesFilePath
  }

  ## Commit these changes.
  git commit -a -m "Reset changes to the patch version."
  
  ## Create the patch release
  python "$EngDir/versioning/set_versions.py" --bt client --new-version $PatchVersion --ar $ArtifactName --gi $GroupId
  if($LASTEXITCODE -ne 0) {
    LogError "Could not set the patch version."
    exit
  }
  
  python "$EngDir/versioning/update_versions.py" --ut library --bt client --tf $ArtifactPomFile 
  & "$EngCommonScriptsDir/Update-ChangeLog.ps1" -Version $PatchVersion -ServiceDirectory $ServiceDirectoryName -PackageName $ArtifactName
    if($LASTEXITCODE -ne 0) {
    LogError "Could not update the versions in the pom files."
    exit
  }
  
  git add $RepoRoot
  git commit -m "Updating the SDK dependencies for $ArtifactName"
  git push -f upstream $BranchName
}
catch {
  // TODO: Add rollback in case of failure.
  LogError "Failed to generate release commit."
}


