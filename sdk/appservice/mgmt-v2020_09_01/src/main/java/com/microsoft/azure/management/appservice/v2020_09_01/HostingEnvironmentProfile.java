/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specification for an App Service Environment to use for this resource.
 */
public class HostingEnvironmentProfile {
    /**
     * Resource ID of the App Service Environment.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Name of the App Service Environment.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type of the App Service Environment.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get resource ID of the App Service Environment.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID of the App Service Environment.
     *
     * @param id the id value to set
     * @return the HostingEnvironmentProfile object itself.
     */
    public HostingEnvironmentProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get name of the App Service Environment.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get resource type of the App Service Environment.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
