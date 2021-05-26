// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class MyWorkbookResource extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MyWorkbookResource.class);

    /*
     * Identity used for BYOS
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * Azure resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Azure resource name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Azure resource type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Resource etag
     */
    @JsonProperty(value = "etag")
    private Map<String, String> etag;

    /**
     * Get the identity property: Identity used for BYOS.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity used for BYOS.
     *
     * @param identity the identity value to set.
     * @return the MyWorkbookResource object itself.
     */
    public MyWorkbookResource withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the id property: Azure resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure resource Id.
     *
     * @param id the id value to set.
     * @return the MyWorkbookResource object itself.
     */
    public MyWorkbookResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Azure resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Azure resource name.
     *
     * @param name the name value to set.
     * @return the MyWorkbookResource object itself.
     */
    public MyWorkbookResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Azure resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Azure resource type.
     *
     * @param type the type value to set.
     * @return the MyWorkbookResource object itself.
     */
    public MyWorkbookResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public Map<String, String> etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Resource etag.
     *
     * @param etag the etag value to set.
     * @return the MyWorkbookResource object itself.
     */
    public MyWorkbookResource withEtag(Map<String, String> etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MyWorkbookResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
