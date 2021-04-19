// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of managed Virtual Network resources. */
@Fluent
public final class ManagedVirtualNetworkListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedVirtualNetworkListResponse.class);

    /*
     * List of managed Virtual Networks.
     */
    @JsonProperty(value = "value", required = true)
    private List<ManagedVirtualNetworkResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of managed Virtual Networks.
     *
     * @return the value value.
     */
    public List<ManagedVirtualNetworkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of managed Virtual Networks.
     *
     * @param value the value value to set.
     * @return the ManagedVirtualNetworkListResponse object itself.
     */
    public ManagedVirtualNetworkListResponse withValue(List<ManagedVirtualNetworkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the ManagedVirtualNetworkListResponse object itself.
     */
    public ManagedVirtualNetworkListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ManagedVirtualNetworkListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
