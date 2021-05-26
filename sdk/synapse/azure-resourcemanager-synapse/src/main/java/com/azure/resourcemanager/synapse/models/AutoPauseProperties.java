// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Auto-pausing properties of a Big Data pool powered by Apache Spark. */
@Fluent
public final class AutoPauseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoPauseProperties.class);

    /*
     * Number of minutes of idle time before the Big Data pool is automatically
     * paused.
     */
    @JsonProperty(value = "delayInMinutes")
    private Integer delayInMinutes;

    /*
     * Whether auto-pausing is enabled for the Big Data pool.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the delayInMinutes property: Number of minutes of idle time before the Big Data pool is automatically paused.
     *
     * @return the delayInMinutes value.
     */
    public Integer delayInMinutes() {
        return this.delayInMinutes;
    }

    /**
     * Set the delayInMinutes property: Number of minutes of idle time before the Big Data pool is automatically paused.
     *
     * @param delayInMinutes the delayInMinutes value to set.
     * @return the AutoPauseProperties object itself.
     */
    public AutoPauseProperties withDelayInMinutes(Integer delayInMinutes) {
        this.delayInMinutes = delayInMinutes;
        return this;
    }

    /**
     * Get the enabled property: Whether auto-pausing is enabled for the Big Data pool.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether auto-pausing is enabled for the Big Data pool.
     *
     * @param enabled the enabled value to set.
     * @return the AutoPauseProperties object itself.
     */
    public AutoPauseProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
