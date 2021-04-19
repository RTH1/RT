// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.models.AvailabilityStatusInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List availabilityStatus operation response. */
@Fluent
public final class AvailabilityStatusListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilityStatusListResult.class);

    /*
     * The list of availabilityStatuses.
     */
    @JsonProperty(value = "value", required = true)
    private List<AvailabilityStatusInner> value;

    /*
     * The URI to fetch the next page of availabilityStatuses. Call ListNext()
     * with this URI to fetch the next page of availabilityStatuses.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of availabilityStatuses.
     *
     * @return the value value.
     */
    public List<AvailabilityStatusInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of availabilityStatuses.
     *
     * @param value the value value to set.
     * @return the AvailabilityStatusListResult object itself.
     */
    public AvailabilityStatusListResult withValue(List<AvailabilityStatusInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of availabilityStatuses. Call ListNext() with this URI
     * to fetch the next page of availabilityStatuses.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of availabilityStatuses. Call ListNext() with this URI
     * to fetch the next page of availabilityStatuses.
     *
     * @param nextLink the nextLink value to set.
     * @return the AvailabilityStatusListResult object itself.
     */
    public AvailabilityStatusListResult withNextLink(String nextLink) {
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
                        "Missing required property value in model AvailabilityStatusListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
