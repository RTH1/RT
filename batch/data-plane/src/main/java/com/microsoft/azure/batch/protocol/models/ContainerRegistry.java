// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A private container registry.
 */
public class ContainerRegistry {
    /**
     * The registry URL.
     * If omitted, the default is "docker.io".
     */
    @JsonProperty(value = "registryServer")
    private String registryServer;

    /**
     * The user name to log into the registry server.
     */
    @JsonProperty(value = "username", required = true)
    private String userName;

    /**
     * The password to log into the registry server.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get if omitted, the default is "docker.io".
     *
     * @return the registryServer value
     */
    public String registryServer() {
        return this.registryServer;
    }

    /**
     * Set if omitted, the default is "docker.io".
     *
     * @param registryServer the registryServer value to set
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withRegistryServer(String registryServer) {
        this.registryServer = registryServer;
        return this;
    }

    /**
     * Get the userName value.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the ContainerRegistry object itself.
     */
    public ContainerRegistry withPassword(String password) {
        this.password = password;
        return this;
    }

}
