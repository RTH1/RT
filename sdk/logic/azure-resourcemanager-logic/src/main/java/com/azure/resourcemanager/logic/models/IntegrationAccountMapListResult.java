// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountMapInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of integration account maps. */
@Fluent
public final class IntegrationAccountMapListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationAccountMapListResult.class);

    /*
     * The list of integration account maps.
     */
    @JsonProperty(value = "value")
    private List<IntegrationAccountMapInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of integration account maps.
     *
     * @return the value value.
     */
    public List<IntegrationAccountMapInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of integration account maps.
     *
     * @param value the value value to set.
     * @return the IntegrationAccountMapListResult object itself.
     */
    public IntegrationAccountMapListResult withValue(List<IntegrationAccountMapInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the IntegrationAccountMapListResult object itself.
     */
    public IntegrationAccountMapListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
