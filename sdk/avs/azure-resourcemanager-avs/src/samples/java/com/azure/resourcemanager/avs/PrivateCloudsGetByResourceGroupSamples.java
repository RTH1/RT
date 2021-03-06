// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for PrivateClouds GetByResourceGroup. */
public final class PrivateCloudsGetByResourceGroupSamples {
    /**
     * Sample code: PrivateClouds_Get.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void privateCloudsGet(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.privateClouds().getByResourceGroupWithResponse("group1", "cloud1", Context.NONE);
    }
}
