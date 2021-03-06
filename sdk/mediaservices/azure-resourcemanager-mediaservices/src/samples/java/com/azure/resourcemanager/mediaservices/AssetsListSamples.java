// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for Assets List. */
public final class AssetsListSamples {
    /**
     * Sample code: List Asset ordered by date.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listAssetOrderedByDate(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.assets().list("contoso", "contosomedia", null, null, "properties/created", Context.NONE);
    }

    /**
     * Sample code: List Asset created in a date range.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listAssetCreatedInADateRange(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .assets()
            .list(
                "contoso",
                "contosomedia",
                "properties/created gt 2012-06-01 and properties/created lt 2013-07-01",
                null,
                "properties/created",
                Context.NONE);
    }

    /**
     * Sample code: List all Assets.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listAllAssets(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.assets().list("contoso", "contosomedia", null, null, null, Context.NONE);
    }
}
