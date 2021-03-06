// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for LiveEvents Reset. */
public final class LiveEventsResetSamples {
    /**
     * Sample code: Reset a LiveEvent.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void resetALiveEvent(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager.liveEvents().reset("mediaresources", "slitestmedia10", "myLiveEvent1", Context.NONE);
    }
}
