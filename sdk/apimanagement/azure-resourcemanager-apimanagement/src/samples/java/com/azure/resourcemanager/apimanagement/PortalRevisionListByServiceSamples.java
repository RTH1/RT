// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for PortalRevision ListByService. */
public final class PortalRevisionListByServiceSamples {
    /*
     * operationId: PortalRevision_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListPortalRevisions
     */
    /**
     * Sample code: ApiManagementListPortalRevisions.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListPortalRevisions(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.portalRevisions().listByService("rg1", "apimService1", null, null, null, Context.NONE);
    }
}
