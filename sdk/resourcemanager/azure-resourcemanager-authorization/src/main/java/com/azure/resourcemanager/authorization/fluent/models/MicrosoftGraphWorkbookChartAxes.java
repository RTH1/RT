// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookChartAxes. */
@Fluent
public final class MicrosoftGraphWorkbookChartAxes extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookChartAxes.class);

    /*
     * workbookChartAxis
     */
    @JsonProperty(value = "categoryAxis")
    private MicrosoftGraphWorkbookChartAxis categoryAxis;

    /*
     * workbookChartAxis
     */
    @JsonProperty(value = "seriesAxis")
    private MicrosoftGraphWorkbookChartAxis seriesAxis;

    /*
     * workbookChartAxis
     */
    @JsonProperty(value = "valueAxis")
    private MicrosoftGraphWorkbookChartAxis valueAxis;

    /*
     * workbookChartAxes
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the categoryAxis property: workbookChartAxis.
     *
     * @return the categoryAxis value.
     */
    public MicrosoftGraphWorkbookChartAxis categoryAxis() {
        return this.categoryAxis;
    }

    /**
     * Set the categoryAxis property: workbookChartAxis.
     *
     * @param categoryAxis the categoryAxis value to set.
     * @return the MicrosoftGraphWorkbookChartAxes object itself.
     */
    public MicrosoftGraphWorkbookChartAxes withCategoryAxis(MicrosoftGraphWorkbookChartAxis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    /**
     * Get the seriesAxis property: workbookChartAxis.
     *
     * @return the seriesAxis value.
     */
    public MicrosoftGraphWorkbookChartAxis seriesAxis() {
        return this.seriesAxis;
    }

    /**
     * Set the seriesAxis property: workbookChartAxis.
     *
     * @param seriesAxis the seriesAxis value to set.
     * @return the MicrosoftGraphWorkbookChartAxes object itself.
     */
    public MicrosoftGraphWorkbookChartAxes withSeriesAxis(MicrosoftGraphWorkbookChartAxis seriesAxis) {
        this.seriesAxis = seriesAxis;
        return this;
    }

    /**
     * Get the valueAxis property: workbookChartAxis.
     *
     * @return the valueAxis value.
     */
    public MicrosoftGraphWorkbookChartAxis valueAxis() {
        return this.valueAxis;
    }

    /**
     * Set the valueAxis property: workbookChartAxis.
     *
     * @param valueAxis the valueAxis value to set.
     * @return the MicrosoftGraphWorkbookChartAxes object itself.
     */
    public MicrosoftGraphWorkbookChartAxes withValueAxis(MicrosoftGraphWorkbookChartAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartAxes.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartAxes.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartAxes object itself.
     */
    public MicrosoftGraphWorkbookChartAxes withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookChartAxes withId(String id) {
        super.withId(id);
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
        if (categoryAxis() != null) {
            categoryAxis().validate();
        }
        if (seriesAxis() != null) {
            seriesAxis().validate();
        }
        if (valueAxis() != null) {
            valueAxis().validate();
        }
    }
}
