// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error encountered by the Batch service when scheduling a job.
 */
public class JobSchedulingError {
    /**
     * The category of the job scheduling error.
     * Possible values include: 'userError', 'serverError'.
     */
    @JsonProperty(value = "category", required = true)
    private ErrorCategory category;

    /**
     * An identifier for the job scheduling error. Codes are invariant and are
     * intended to be consumed programmatically.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * A message describing the job scheduling error, intended to be suitable
     * for display in a user interface.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * A list of additional error details related to the scheduling error.
     */
    @JsonProperty(value = "details")
    private List<NameValuePair> details;

    /**
     * Get possible values include: 'userError', 'serverError'.
     *
     * @return the category value
     */
    public ErrorCategory category() {
        return this.category;
    }

    /**
     * Set possible values include: 'userError', 'serverError'.
     *
     * @param category the category value to set
     * @return the JobSchedulingError object itself.
     */
    public JobSchedulingError withCategory(ErrorCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the JobSchedulingError object itself.
     */
    public JobSchedulingError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the JobSchedulingError object itself.
     */
    public JobSchedulingError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<NameValuePair> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the JobSchedulingError object itself.
     */
    public JobSchedulingError withDetails(List<NameValuePair> details) {
        this.details = details;
        return this;
    }

}
