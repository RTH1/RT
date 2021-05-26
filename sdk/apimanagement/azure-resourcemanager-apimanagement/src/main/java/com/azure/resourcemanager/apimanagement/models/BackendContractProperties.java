// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Create Backend operation. */
@Fluent
public final class BackendContractProperties extends BackendBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendContractProperties.class);

    /*
     * Runtime Url of the Backend.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /*
     * Backend communication protocol.
     */
    @JsonProperty(value = "protocol", required = true)
    private BackendProtocol protocol;

    /**
     * Get the url property: Runtime Url of the Backend.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Runtime Url of the Backend.
     *
     * @param url the url value to set.
     * @return the BackendContractProperties object itself.
     */
    public BackendContractProperties withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the protocol property: Backend communication protocol.
     *
     * @return the protocol value.
     */
    public BackendProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Backend communication protocol.
     *
     * @param protocol the protocol value to set.
     * @return the BackendContractProperties object itself.
     */
    public BackendContractProperties withProtocol(BackendProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withTitle(String title) {
        super.withTitle(title);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withProperties(BackendProperties properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withCredentials(BackendCredentialsContract credentials) {
        super.withCredentials(credentials);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withProxy(BackendProxyContract proxy) {
        super.withProxy(proxy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackendContractProperties withTls(BackendTlsProperties tls) {
        super.withTls(tls);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property url in model BackendContractProperties"));
        }
        if (protocol() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model BackendContractProperties"));
        }
    }
}
