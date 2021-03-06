// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for RoleInstances Start. */
public final class RoleInstancesStartSamples {
    /**
     * Sample code: Start a role instance of a vendor network function.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void startARoleInstanceOfAVendorNetworkFunction(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.roleInstances().start("eastus", "testVendor", "testServiceKey", "mrm", Context.NONE);
    }
}
