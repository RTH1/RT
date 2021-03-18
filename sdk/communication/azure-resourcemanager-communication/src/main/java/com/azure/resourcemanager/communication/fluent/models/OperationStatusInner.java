// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.communication.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The current status of an async operation. */
@JsonFlatten
@Fluent
public class OperationStatusInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusInner.class);

    /*
     * Fully qualified ID for the operation status.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The start time of the operation
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time of the operation
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * Percent of the operation that is complete
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Float percentComplete;

    /*
     * The error object.
     */
    @JsonProperty(value = "error.error")
    private ManagementError error;

    /**
     * Get the id property: Fully qualified ID for the operation status.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the status property: Provisioning state of the resource.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the percentComplete property: Percent of the operation that is complete.
     *
     * @return the percentComplete value.
     */
    public Float percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: The error object.
     *
     * @param error the error value to set.
     * @return the OperationStatusInner object itself.
     */
    public OperationStatusInner withError(ManagementError error) {
        this.error = error;
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