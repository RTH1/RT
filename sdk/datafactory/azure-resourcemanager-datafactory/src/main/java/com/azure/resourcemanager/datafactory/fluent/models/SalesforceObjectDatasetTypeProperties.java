// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Salesforce object dataset properties. */
@Fluent
public final class SalesforceObjectDatasetTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SalesforceObjectDatasetTypeProperties.class);

    /*
     * The Salesforce object API name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "objectApiName")
    private Object objectApiName;

    /**
     * Get the objectApiName property: The Salesforce object API name. Type: string (or Expression with resultType
     * string).
     *
     * @return the objectApiName value.
     */
    public Object objectApiName() {
        return this.objectApiName;
    }

    /**
     * Set the objectApiName property: The Salesforce object API name. Type: string (or Expression with resultType
     * string).
     *
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceObjectDatasetTypeProperties object itself.
     */
    public SalesforceObjectDatasetTypeProperties withObjectApiName(Object objectApiName) {
        this.objectApiName = objectApiName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
