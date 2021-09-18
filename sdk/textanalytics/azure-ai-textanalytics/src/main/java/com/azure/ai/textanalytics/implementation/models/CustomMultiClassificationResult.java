// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CustomMultiClassificationResult model. */
@Fluent
public final class CustomMultiClassificationResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<MultiClassificationDocument> documents;

    /*
     * Errors by document id.
     */
    @JsonProperty(value = "errors", required = true)
    private List<DocumentError> errors;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the request payload.
     */
    @JsonProperty(value = "statistics")
    private RequestStatistics statistics;

    /*
     * This field indicates the project name for the model.
     */
    @JsonProperty(value = "projectName", required = true)
    private String projectName;

    /*
     * This field indicates the deployment name for the model.
     */
    @JsonProperty(value = "deploymentName", required = true)
    private String deploymentName;

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<MultiClassificationDocument> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the CustomMultiClassificationResult object itself.
     */
    public CustomMultiClassificationResult setDocuments(List<MultiClassificationDocument> documents) {
        this.documents = documents;
        return this;
    }

    /**
     * Get the errors property: Errors by document id.
     *
     * @return the errors value.
     */
    public List<DocumentError> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors by document id.
     *
     * @param errors the errors value to set.
     * @return the CustomMultiClassificationResult object itself.
     */
    public CustomMultiClassificationResult setErrors(List<DocumentError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @return the statistics value.
     */
    public RequestStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @param statistics the statistics value to set.
     * @return the CustomMultiClassificationResult object itself.
     */
    public CustomMultiClassificationResult setStatistics(RequestStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the projectName property: This field indicates the project name for the model.
     *
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: This field indicates the project name for the model.
     *
     * @param projectName the projectName value to set.
     * @return the CustomMultiClassificationResult object itself.
     */
    public CustomMultiClassificationResult setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get the deploymentName property: This field indicates the deployment name for the model.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: This field indicates the deployment name for the model.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the CustomMultiClassificationResult object itself.
     */
    public CustomMultiClassificationResult setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
}
