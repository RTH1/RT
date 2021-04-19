// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The required set of inputs to validate a VNET. */
@JsonFlatten
@Fluent
public class VnetParameters extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetParameters.class);

    /*
     * The Resource Group of the VNET to be validated
     */
    @JsonProperty(value = "properties.vnetResourceGroup")
    private String vnetResourceGroup;

    /*
     * The name of the VNET to be validated
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /*
     * The subnet name to be validated
     */
    @JsonProperty(value = "properties.vnetSubnetName")
    private String vnetSubnetName;

    /*
     * The ARM Resource ID of the subnet to validate
     */
    @JsonProperty(value = "properties.subnetResourceId")
    private String subnetResourceId;

    /**
     * Get the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @return the vnetResourceGroup value.
     */
    public String vnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    /**
     * Set the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @param vnetResourceGroup the vnetResourceGroup value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetResourceGroup(String vnetResourceGroup) {
        this.vnetResourceGroup = vnetResourceGroup;
        return this;
    }

    /**
     * Get the vnetName property: The name of the VNET to be validated.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName property: The name of the VNET to be validated.
     *
     * @param vnetName the vnetName value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vnetSubnetName property: The subnet name to be validated.
     *
     * @return the vnetSubnetName value.
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName property: The subnet name to be validated.
     *
     * @param vnetSubnetName the vnetSubnetName value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
        return this;
    }

    /**
     * Get the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     *
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     *
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the VnetParameters object itself.
     */
    public VnetParameters withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VnetParameters withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
