/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification of the all the metrics provided for a resource type.
 */
public class ApiOperationPropertiesServiceSpecification {
    /**
     * Details about operations related to metrics.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Get details about operations related to metrics.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set details about operations related to metrics.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the ApiOperationPropertiesServiceSpecification object itself.
     */
    public ApiOperationPropertiesServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
