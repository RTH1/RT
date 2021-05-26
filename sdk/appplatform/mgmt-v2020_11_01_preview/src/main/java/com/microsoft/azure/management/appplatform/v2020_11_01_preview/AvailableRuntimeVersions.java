/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.AppPlatformManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.AvailableRuntimeVersionsInner;
import java.util.List;

/**
 * Type representing AvailableRuntimeVersions.
 */
public interface AvailableRuntimeVersions extends HasInner<AvailableRuntimeVersionsInner>, HasManager<AppPlatformManager> {
    /**
     * @return the value value.
     */
    List<SupportedRuntimeVersion> value();

}
