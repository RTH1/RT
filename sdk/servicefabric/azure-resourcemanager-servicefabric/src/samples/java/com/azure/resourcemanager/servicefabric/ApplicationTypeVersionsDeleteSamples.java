// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for ApplicationTypeVersions Delete. */
public final class ApplicationTypeVersionsDeleteSamples {
    /*
     * operationId: ApplicationTypeVersions_Delete
     * api-version: 2021-06-01
     * x-ms-examples: Delete an application type version
     */
    /**
     * Sample code: Delete an application type version.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void deleteAnApplicationTypeVersion(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.applicationTypeVersions().delete("resRg", "myCluster", "myAppType", "1.0", Context.NONE);
    }
}
