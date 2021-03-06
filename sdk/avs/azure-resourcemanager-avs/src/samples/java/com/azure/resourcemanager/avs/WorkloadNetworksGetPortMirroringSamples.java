// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetPortMirroring. */
public final class WorkloadNetworksGetPortMirroringSamples {
    /**
     * Sample code: WorkloadNetworks_GetPortMirroring.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksGetPortMirroring(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().getPortMirroringWithResponse("group1", "cloud1", "portMirroring1", Context.NONE);
    }
}
