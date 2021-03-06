// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A hub setting. */
@Fluent
public final class WebPubSubHubInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebPubSubHubInner.class);

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Properties of the hub setting.
     */
    @JsonProperty(value = "properties", required = true)
    private WebPubSubHubProperties properties;

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: Properties of the hub setting.
     *
     * @return the properties value.
     */
    public WebPubSubHubProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the hub setting.
     *
     * @param properties the properties value to set.
     * @return the WebPubSubHubInner object itself.
     */
    public WebPubSubHubInner withProperties(WebPubSubHubProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model WebPubSubHubInner"));
        } else {
            properties().validate();
        }
    }
}
