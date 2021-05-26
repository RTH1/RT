// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backend entity base Parameter set. */
@Fluent
public class BackendBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendBaseParameters.class);

    /*
     * Backend Title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Backend Description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Management Uri of the Resource in External System. This url can be the
     * Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Backend Properties contract
     */
    @JsonProperty(value = "properties")
    private BackendProperties properties;

    /*
     * Backend Credentials Contract Properties
     */
    @JsonProperty(value = "credentials")
    private BackendCredentialsContract credentials;

    /*
     * Backend Proxy Contract Properties
     */
    @JsonProperty(value = "proxy")
    private BackendProxyContract proxy;

    /*
     * Backend TLS Properties
     */
    @JsonProperty(value = "tls")
    private BackendTlsProperties tls;

    /**
     * Get the title property: Backend Title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Backend Title.
     *
     * @param title the title value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Backend Description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Backend Description.
     *
     * @param description the description value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the resourceId property: Management Uri of the Resource in External System. This url can be the Arm Resource
     * Id of Logic Apps, Function Apps or Api Apps.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Management Uri of the Resource in External System. This url can be the Arm Resource
     * Id of Logic Apps, Function Apps or Api Apps.
     *
     * @param resourceId the resourceId value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the properties property: Backend Properties contract.
     *
     * @return the properties value.
     */
    public BackendProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Backend Properties contract.
     *
     * @param properties the properties value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withProperties(BackendProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the credentials property: Backend Credentials Contract Properties.
     *
     * @return the credentials value.
     */
    public BackendCredentialsContract credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Backend Credentials Contract Properties.
     *
     * @param credentials the credentials value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withCredentials(BackendCredentialsContract credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the proxy property: Backend Proxy Contract Properties.
     *
     * @return the proxy value.
     */
    public BackendProxyContract proxy() {
        return this.proxy;
    }

    /**
     * Set the proxy property: Backend Proxy Contract Properties.
     *
     * @param proxy the proxy value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withProxy(BackendProxyContract proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get the tls property: Backend TLS Properties.
     *
     * @return the tls value.
     */
    public BackendTlsProperties tls() {
        return this.tls;
    }

    /**
     * Set the tls property: Backend TLS Properties.
     *
     * @param tls the tls value to set.
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withTls(BackendTlsProperties tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (credentials() != null) {
            credentials().validate();
        }
        if (proxy() != null) {
            proxy().validate();
        }
        if (tls() != null) {
            tls().validate();
        }
    }
}
