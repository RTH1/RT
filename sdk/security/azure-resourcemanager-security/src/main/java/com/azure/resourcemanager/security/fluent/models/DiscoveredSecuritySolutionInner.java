// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DiscoveredSecuritySolution model. */
@JsonFlatten
@Fluent
public class DiscoveredSecuritySolutionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiscoveredSecuritySolutionInner.class);

    /*
     * The security family of the discovered solution
     */
    @JsonProperty(value = "properties.securityFamily", required = true)
    private SecurityFamily securityFamily;

    /*
     * The security solutions' image offer
     */
    @JsonProperty(value = "properties.offer", required = true)
    private String offer;

    /*
     * The security solutions' image publisher
     */
    @JsonProperty(value = "properties.publisher", required = true)
    private String publisher;

    /*
     * The security solutions' image sku
     */
    @JsonProperty(value = "properties.sku", required = true)
    private String sku;

    /*
     * Location where the resource is stored
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the securityFamily property: The security family of the discovered solution.
     *
     * @return the securityFamily value.
     */
    public SecurityFamily securityFamily() {
        return this.securityFamily;
    }

    /**
     * Set the securityFamily property: The security family of the discovered solution.
     *
     * @param securityFamily the securityFamily value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSecurityFamily(SecurityFamily securityFamily) {
        this.securityFamily = securityFamily;
        return this;
    }

    /**
     * Get the offer property: The security solutions' image offer.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The security solutions' image offer.
     *
     * @param offer the offer value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the publisher property: The security solutions' image publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The security solutions' image publisher.
     *
     * @param publisher the publisher value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the sku property: The security solutions' image sku.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The security solutions' image sku.
     *
     * @param sku the sku value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the location property: Location where the resource is stored.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityFamily() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property securityFamily in model DiscoveredSecuritySolutionInner"));
        }
        if (offer() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property offer in model DiscoveredSecuritySolutionInner"));
        }
        if (publisher() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publisher in model DiscoveredSecuritySolutionInner"));
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model DiscoveredSecuritySolutionInner"));
        }
    }
}
