// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for ContentKeyPolicies GetPolicyPropertiesWithSecrets. */
public final class ContentKeyPoliciesGetPolicyPropertiesWithSecretsSamples {
    /**
     * Sample code: Get an Content Key Policy with secrets.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void getAnContentKeyPolicyWithSecrets(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .contentKeyPolicies()
            .getPolicyPropertiesWithSecretsWithResponse(
                "contoso", "contosomedia", "PolicyWithMultipleOptions", Context.NONE);
    }
}
