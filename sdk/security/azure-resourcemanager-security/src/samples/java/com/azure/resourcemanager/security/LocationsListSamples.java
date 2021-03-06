// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Locations List. */
public final class LocationsListSamples {
    /**
     * Sample code: Get security data locations.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSecurityDataLocations(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.locations().list(Context.NONE);
    }
}
