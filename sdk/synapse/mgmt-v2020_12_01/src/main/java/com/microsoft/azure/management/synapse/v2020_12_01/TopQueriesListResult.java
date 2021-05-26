/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the response to a get top queries request.
 */
public class TopQueriesListResult {
    /**
     * The list of top queries.
     */
    @JsonProperty(value = "value", required = true)
    private List<TopQueries> value;

    /**
     * Get the list of top queries.
     *
     * @return the value value
     */
    public List<TopQueries> value() {
        return this.value;
    }

    /**
     * Set the list of top queries.
     *
     * @param value the value value to set
     * @return the TopQueriesListResult object itself.
     */
    public TopQueriesListResult withValue(List<TopQueries> value) {
        this.value = value;
        return this;
    }

}
