/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about SSH certificate public key data.
 */
public class ContainerServiceSshPublicKey {
    /**
     * Certificate public key used to authenticate with VMs through SSH. The
     * certificate must be in PEM format with or without headers.
     */
    @JsonProperty(value = "keyData", required = true)
    private String keyData;

    /**
     * Get certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     *
     * @return the keyData value
     */
    public String keyData() {
        return this.keyData;
    }

    /**
     * Set certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     *
     * @param keyData the keyData value to set
     * @return the ContainerServiceSshPublicKey object itself.
     */
    public ContainerServiceSshPublicKey withKeyData(String keyData) {
        this.keyData = keyData;
        return this;
    }

}
