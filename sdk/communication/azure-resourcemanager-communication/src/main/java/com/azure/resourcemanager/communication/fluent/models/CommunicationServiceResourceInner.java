// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.communication.models.LocationResource;
import com.azure.resourcemanager.communication.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A class representing a CommunicationService resource. */
@JsonFlatten
@Fluent
public class CommunicationServiceResourceInner extends LocationResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommunicationServiceResourceInner.class);

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * FQDN of the CommunicationService instance.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The location where the communication service stores its data at rest.
     */
    @JsonProperty(value = "properties.dataLocation")
    private String dataLocation;

    /*
     * Resource ID of an Azure Notification Hub linked to this resource.
     */
    @JsonProperty(value = "properties.notificationHubId", access = JsonProperty.Access.WRITE_ONLY)
    private String notificationHubId;

    /*
     * Version of the CommunicationService resource. Probably you need the same
     * or higher version of client SDKs.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The immutable resource Id of the communication service.
     */
    @JsonProperty(value = "properties.immutableResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String immutableResourceId;

    /*
     * Tags of the service which is a list of key value pairs that describe the
     * resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostname property: FQDN of the CommunicationService instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the dataLocation property: The location where the communication service stores its data at rest.
     *
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Set the dataLocation property: The location where the communication service stores its data at rest.
     *
     * @param dataLocation the dataLocation value to set.
     * @return the CommunicationServiceResourceInner object itself.
     */
    public CommunicationServiceResourceInner withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * Get the notificationHubId property: Resource ID of an Azure Notification Hub linked to this resource.
     *
     * @return the notificationHubId value.
     */
    public String notificationHubId() {
        return this.notificationHubId;
    }

    /**
     * Get the version property: Version of the CommunicationService resource. Probably you need the same or higher
     * version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the immutableResourceId property: The immutable resource Id of the communication service.
     *
     * @return the immutableResourceId value.
     */
    public String immutableResourceId() {
        return this.immutableResourceId;
    }

    /**
     * Get the tags property: Tags of the service which is a list of key value pairs that describe the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the service which is a list of key value pairs that describe the resource.
     *
     * @param tags the tags value to set.
     * @return the CommunicationServiceResourceInner object itself.
     */
    public CommunicationServiceResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommunicationServiceResourceInner withLocation(String location) {
        super.withLocation(location);
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
    }
}
