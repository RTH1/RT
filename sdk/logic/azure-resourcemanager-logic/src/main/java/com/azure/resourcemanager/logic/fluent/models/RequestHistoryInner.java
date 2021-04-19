// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.RequestHistoryProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The request history. */
@Fluent
public final class RequestHistoryInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequestHistoryInner.class);

    /*
     * The request history properties.
     */
    @JsonProperty(value = "properties")
    private RequestHistoryProperties properties;

    /**
     * Get the properties property: The request history properties.
     *
     * @return the properties value.
     */
    public RequestHistoryProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The request history properties.
     *
     * @param properties the properties value to set.
     * @return the RequestHistoryInner object itself.
     */
    public RequestHistoryInner withProperties(RequestHistoryProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestHistoryInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RequestHistoryInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
