// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WafRankingsResponseDataItem model. */
@Fluent
public final class WafRankingsResponseDataItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WafRankingsResponseDataItem.class);

    /*
     * The groupValues property.
     */
    @JsonProperty(value = "groupValues")
    private List<String> groupValues;

    /*
     * The metrics property.
     */
    @JsonProperty(value = "metrics")
    private List<ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems> metrics;

    /**
     * Get the groupValues property: The groupValues property.
     *
     * @return the groupValues value.
     */
    public List<String> groupValues() {
        return this.groupValues;
    }

    /**
     * Set the groupValues property: The groupValues property.
     *
     * @param groupValues the groupValues value to set.
     * @return the WafRankingsResponseDataItem object itself.
     */
    public WafRankingsResponseDataItem withGroupValues(List<String> groupValues) {
        this.groupValues = groupValues;
        return this;
    }

    /**
     * Get the metrics property: The metrics property.
     *
     * @return the metrics value.
     */
    public List<ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: The metrics property.
     *
     * @param metrics the metrics value to set.
     * @return the WafRankingsResponseDataItem object itself.
     */
    public WafRankingsResponseDataItem withMetrics(
        List<ComponentsKpo1PjSchemasWafrankingsresponsePropertiesDataItemsPropertiesMetricsItems> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
    }
}
