// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** contentTypeInfo. */
@Fluent
public final class MicrosoftGraphContentTypeInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphContentTypeInfo.class);

    /*
     * The id of the content type.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the content type.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * contentTypeInfo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the id property: The id of the content type.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the content type.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphContentTypeInfo object itself.
     */
    public MicrosoftGraphContentTypeInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the content type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the content type.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphContentTypeInfo object itself.
     */
    public MicrosoftGraphContentTypeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the additionalProperties property: contentTypeInfo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: contentTypeInfo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphContentTypeInfo object itself.
     */
    public MicrosoftGraphContentTypeInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
