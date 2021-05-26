// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ArtifactSourceInner;
import com.azure.resourcemanager.deploymentmanager.models.ArtifactSource;
import com.azure.resourcemanager.deploymentmanager.models.Authentication;
import java.util.Collections;
import java.util.Map;

public final class ArtifactSourceImpl implements ArtifactSource, ArtifactSource.Definition, ArtifactSource.Update {
    private ArtifactSourceInner innerObject;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String sourceType() {
        return this.innerModel().sourceType();
    }

    public String artifactRoot() {
        return this.innerModel().artifactRoot();
    }

    public Authentication authentication() {
        return this.innerModel().authentication();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ArtifactSourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String artifactSourceName;

    public ArtifactSourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ArtifactSource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, artifactSourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, artifactSourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ArtifactSourceImpl(String name, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = new ArtifactSourceInner();
        this.serviceManager = serviceManager;
        this.artifactSourceName = name;
    }

    public ArtifactSourceImpl update() {
        return this;
    }

    public ArtifactSource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, artifactSourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .createOrUpdateWithResponse(resourceGroupName, artifactSourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ArtifactSourceImpl(
        ArtifactSourceInner innerObject, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.artifactSourceName = Utils.getValueFromIdByName(innerObject.id(), "artifactSources");
    }

    public ArtifactSource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .getByResourceGroupWithResponse(resourceGroupName, artifactSourceName, Context.NONE)
                .getValue();
        return this;
    }

    public ArtifactSource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getArtifactSources()
                .getByResourceGroupWithResponse(resourceGroupName, artifactSourceName, context)
                .getValue();
        return this;
    }

    public ArtifactSourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ArtifactSourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ArtifactSourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ArtifactSourceImpl withSourceType(String sourceType) {
        this.innerModel().withSourceType(sourceType);
        return this;
    }

    public ArtifactSourceImpl withArtifactRoot(String artifactRoot) {
        this.innerModel().withArtifactRoot(artifactRoot);
        return this;
    }

    public ArtifactSourceImpl withAuthentication(Authentication authentication) {
        this.innerModel().withAuthentication(authentication);
        return this;
    }
}
