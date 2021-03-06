// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.TagContract;

/** Samples for Tag Update. */
public final class TagUpdateSamples {
    /*
     * operationId: Tag_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateTag
     */
    /**
     * Sample code: ApiManagementUpdateTag.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateTag(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        TagContract resource =
            manager.tags().getWithResponse("rg1", "apimService1", "temptag", Context.NONE).getValue();
        resource.update().withDisplayName("temp tag").withIfMatch("*").apply();
    }
}
