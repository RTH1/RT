// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPoolsOperation ListSkusByResource. */
public final class KustoPoolsOperationListSkusByResourceSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolsListResourceSkus.json
     */
    /**
     * Sample code: KustoPoolsListResourceSkus.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolsListResourceSkus(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolsOperations()
            .listSkusByResource("synapseWorkspaceName", "kustoclusterrptest4", "kustorptest", Context.NONE);
    }
}
