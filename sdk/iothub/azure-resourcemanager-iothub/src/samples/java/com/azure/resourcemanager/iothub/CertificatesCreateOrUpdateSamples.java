// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.resourcemanager.iothub.models.CertificateProperties;

/** Samples for Certificates CreateOrUpdate. */
public final class CertificatesCreateOrUpdateSamples {
    /**
     * Sample code: Certificates_CreateOrUpdate.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void certificatesCreateOrUpdate(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .certificates()
            .define("cert")
            .withExistingIotHub("myResourceGroup", "iothub")
            .withProperties(new CertificateProperties().withCertificate("############################################"))
            .create();
    }
}
