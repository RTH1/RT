/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, or
 * UltraSSD_LRS.
 */
public class DiskSku {
    /**
     * The sku name. Possible values include: 'Standard_LRS', 'Premium_LRS',
     * 'StandardSSD_LRS', 'UltraSSD_LRS'.
     */
    @JsonProperty(value = "name")
    private DiskStorageAccountTypes name;

    /**
     * The sku tier.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * Get the sku name. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS', 'UltraSSD_LRS'.
     *
     * @return the name value
     */
    public DiskStorageAccountTypes name() {
        return this.name;
    }

    /**
     * Set the sku name. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS', 'UltraSSD_LRS'.
     *
     * @param name the name value to set
     * @return the DiskSku object itself.
     */
    public DiskSku withName(DiskStorageAccountTypes name) {
        this.name = name;
        return this;
    }

    /**
     * Get the sku tier.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

}
