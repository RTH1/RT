// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomMultiClassificationTaskParameters model. */
@Fluent
public final class CustomMultiClassificationTaskParameters {
    /*
     * The projectName property.
     */
    @JsonProperty(value = "projectName")
    private String projectName;

    /*
     * The deploymentName property.
     */
    @JsonProperty(value = "deploymentName")
    private String deploymentName;

    /*
     * The loggingOptOut property.
     */
    @JsonProperty(value = "loggingOptOut")
    private Boolean loggingOptOut;

    /**
     * Get the projectName property: The projectName property.
     *
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Set the projectName property: The projectName property.
     *
     * @param projectName the projectName value to set.
     * @return the CustomMultiClassificationTaskParameters object itself.
     */
    public CustomMultiClassificationTaskParameters setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get the deploymentName property: The deploymentName property.
     *
     * @return the deploymentName value.
     */
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The deploymentName property.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the CustomMultiClassificationTaskParameters object itself.
     */
    public CustomMultiClassificationTaskParameters setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the loggingOptOut property: The loggingOptOut property.
     *
     * @return the loggingOptOut value.
     */
    public Boolean isLoggingOptOut() {
        return this.loggingOptOut;
    }

    /**
     * Set the loggingOptOut property: The loggingOptOut property.
     *
     * @param loggingOptOut the loggingOptOut value to set.
     * @return the CustomMultiClassificationTaskParameters object itself.
     */
    public CustomMultiClassificationTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        this.loggingOptOut = loggingOptOut;
        return this;
    }
}
