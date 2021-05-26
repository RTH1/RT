// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataFeedDimension model. */
@Fluent
public final class DataFeedDimension {
    /*
     * dimension name
     */
    @JsonProperty(value = "dimensionName", required = true)
    private String name;

    /*
     * dimension display name
     */
    @JsonProperty(value = "dimensionDisplayName")
    private String displayName;

    /**
     * Get the dimensionName property: dimension name.
     *
     * @return the dimensionName value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the dimensionName property: dimension name.
     *
     * @param dimensionName the dimensionName value to set.
     * @return the DataFeedDimension object itself.
     */
    public DataFeedDimension setName(String dimensionName) {
        this.name = dimensionName;
        return this;
    }

    /**
     * Get the dimensionDisplayName property: dimension display name.
     *
     * @return the dimensionDisplayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the dimensionDisplayName property: dimension display name.
     *
     * @param dimensionDisplayName the dimensionDisplayName value to set.
     * @return the DataFeedDimension object itself.
     */
    public DataFeedDimension setDisplayName(String dimensionDisplayName) {
        this.displayName = dimensionDisplayName;
        return this;
    }
}
