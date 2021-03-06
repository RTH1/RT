// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Reports ListByGeo. */
public final class ReportsListByGeoSamples {
    /*
     * operationId: Reports_ListByGeo
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetReportsByGeo
     */
    /**
     * Sample code: ApiManagementGetReportsByGeo.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetReportsByGeo(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .reports()
            .listByGeo(
                "rg1",
                "apimService1",
                "timestamp ge datetime'2017-06-01T00:00:00' and timestamp le datetime'2017-06-04T00:00:00'",
                null,
                null,
                Context.NONE);
    }
}
