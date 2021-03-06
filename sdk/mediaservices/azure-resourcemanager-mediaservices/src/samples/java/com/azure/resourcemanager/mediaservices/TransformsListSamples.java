// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for Transforms List. */
public final class TransformsListSamples {
    /**
     * Sample code: Lists the Transforms filter by created.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listsTheTransformsFilterByCreated(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "properties/created gt 2021-06-01T00:00:00.0000000Z and properties/created le"
                    + " 2021-06-01T00:00:10.0000000Z",
                "properties/created",
                Context.NONE);
    }

    /**
     * Sample code: Lists the Transforms filter by name.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listsTheTransformsFilterByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "(name eq 'sampleEncode') or (name eq 'sampleEncodeAndVideoIndex')",
                "name desc",
                Context.NONE);
    }

    /**
     * Sample code: Lists the Transforms filter by lastmodified.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listsTheTransformsFilterByLastmodified(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .transforms()
            .list(
                "contosoresources",
                "contosomedia",
                "properties/lastmodified gt 2021-06-01T00:00:00.0000000Z and properties/lastmodified le"
                    + " 2021-06-01T00:00:10.0000000Z",
                "properties/lastmodified desc",
                Context.NONE);
    }

    /**
     * Sample code: Lists the Transforms.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listsTheTransforms(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.transforms().list("contosoresources", "contosomedia", null, null, Context.NONE);
    }
}
