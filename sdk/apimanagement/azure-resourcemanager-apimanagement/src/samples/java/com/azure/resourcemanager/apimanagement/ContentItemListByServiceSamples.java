// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ContentItem ListByService. */
public final class ContentItemListByServiceSamples {
    /*
     * operationId: ContentItem_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListContentTypeContentItems
     */
    /**
     * Sample code: ApiManagementListContentTypeContentItems.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListContentTypeContentItems(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.contentItems().listByService("rg1", "apimService1", "page", Context.NONE);
    }
}
