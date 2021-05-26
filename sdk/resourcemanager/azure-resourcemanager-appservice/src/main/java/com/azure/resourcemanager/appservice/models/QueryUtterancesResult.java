// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result for utterances query. */
@Fluent
public final class QueryUtterancesResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryUtterancesResult.class);

    /*
     * A sample utterance.
     */
    @JsonProperty(value = "sampleUtterance")
    private SampleUtterance sampleUtterance;

    /*
     * Score of a sample utterance.
     */
    @JsonProperty(value = "score")
    private Float score;

    /**
     * Get the sampleUtterance property: A sample utterance.
     *
     * @return the sampleUtterance value.
     */
    public SampleUtterance sampleUtterance() {
        return this.sampleUtterance;
    }

    /**
     * Set the sampleUtterance property: A sample utterance.
     *
     * @param sampleUtterance the sampleUtterance value to set.
     * @return the QueryUtterancesResult object itself.
     */
    public QueryUtterancesResult withSampleUtterance(SampleUtterance sampleUtterance) {
        this.sampleUtterance = sampleUtterance;
        return this;
    }

    /**
     * Get the score property: Score of a sample utterance.
     *
     * @return the score value.
     */
    public Float score() {
        return this.score;
    }

    /**
     * Set the score property: Score of a sample utterance.
     *
     * @param score the score value to set.
     * @return the QueryUtterancesResult object itself.
     */
    public QueryUtterancesResult withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sampleUtterance() != null) {
            sampleUtterance().validate();
        }
    }
}
