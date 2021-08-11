// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem model. */
@Fluent
public final class AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem.class);

    /*
     * Whether this version is the default agent pool version.
     */
    @JsonProperty(value = "default")
    private Boolean defaultProperty;

    /*
     * The Kubernetes version (major.minor.patch).
     */
    @JsonProperty(value = "kubernetesVersion")
    private String kubernetesVersion;

    /*
     * Whether Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /**
     * Get the defaultProperty property: Whether this version is the default agent pool version.
     *
     * @return the defaultProperty value.
     */
    public Boolean defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Whether this version is the default agent pool version.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withDefaultProperty(Boolean defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @param isPreview the isPreview value to set.
     * @return the AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem object itself.
     */
    public AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
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
