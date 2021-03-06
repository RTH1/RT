// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Settings List. */
public final class SettingsListSamples {
    /**
     * Sample code: Get settings of subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSettingsOfSubscription(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.settings().list(Context.NONE);
    }
}
