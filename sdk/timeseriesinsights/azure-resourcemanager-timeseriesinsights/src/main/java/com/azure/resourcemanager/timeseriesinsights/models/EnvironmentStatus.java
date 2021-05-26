// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
 */
@Immutable
public final class EnvironmentStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentStatus.class);

    /*
     * An object that represents the status of ingress on an environment.
     */
    @JsonProperty(value = "ingress", access = JsonProperty.Access.WRITE_ONLY)
    private IngressEnvironmentStatus ingress;

    /*
     * An object that represents the status of warm storage on an environment.
     */
    @JsonProperty(value = "warmStorage", access = JsonProperty.Access.WRITE_ONLY)
    private WarmStorageEnvironmentStatus warmStorage;

    /**
     * Get the ingress property: An object that represents the status of ingress on an environment.
     *
     * @return the ingress value.
     */
    public IngressEnvironmentStatus ingress() {
        return this.ingress;
    }

    /**
     * Get the warmStorage property: An object that represents the status of warm storage on an environment.
     *
     * @return the warmStorage value.
     */
    public WarmStorageEnvironmentStatus warmStorage() {
        return this.warmStorage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ingress() != null) {
            ingress().validate();
        }
        if (warmStorage() != null) {
            warmStorage().validate();
        }
    }
}
