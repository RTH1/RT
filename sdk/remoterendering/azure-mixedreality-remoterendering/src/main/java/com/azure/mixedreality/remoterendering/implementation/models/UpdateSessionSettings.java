// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings used to update the session. */
@Fluent
public final class UpdateSessionSettings {
    /*
     * Update to the time the session will run after it reached the 'Ready'
     * state. It has to be larger than the current value of maxLeaseTimeMinutes
     * and less than 1440.
     */
    @JsonProperty(value = "maxLeaseTimeMinutes", required = true)
    private int maxLeaseTimeMinutes;

    /**
     * Creates an instance of UpdateSessionSettings class.
     *
     * @param maxLeaseTimeMinutes the maxLeaseTimeMinutes value to set.
     */
    @JsonCreator
    public UpdateSessionSettings(
            @JsonProperty(value = "maxLeaseTimeMinutes", required = true) int maxLeaseTimeMinutes) {
        this.maxLeaseTimeMinutes = maxLeaseTimeMinutes;
    }

    /**
     * Get the maxLeaseTimeMinutes property: Update to the time the session will run after it reached the 'Ready' state.
     * It has to be larger than the current value of maxLeaseTimeMinutes and less than 1440.
     *
     * @return the maxLeaseTimeMinutes value.
     */
    public int getMaxLeaseTimeMinutes() {
        return this.maxLeaseTimeMinutes;
    }
}
