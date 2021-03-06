// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.util.Context;

/** Samples for MonitoredResources List. */
public final class MonitoredResourcesListSamples {
    /**
     * Sample code: MonitoredResources_List.
     *
     * @param elasticManager Entry point to ElasticManager.
     */
    public static void monitoredResourcesList(com.azure.resourcemanager.elastic.ElasticManager elasticManager) {
        elasticManager.monitoredResources().list("myResourceGroup", "myMonitor", Context.NONE);
    }
}
