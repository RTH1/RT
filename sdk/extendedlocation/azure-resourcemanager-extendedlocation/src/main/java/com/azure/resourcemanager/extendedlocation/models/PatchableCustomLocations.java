// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Custom Locations patchable resource definition. */
@Fluent
public final class PatchableCustomLocations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchableCustomLocations.class);

    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The Custom Locations patchable properties.
     */
    @JsonProperty(value = "properties")
    private CustomLocationProperties innerProperties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The Custom Locations patchable properties.
     *
     * @return the innerProperties value.
     */
    private CustomLocationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the authentication property: This is optional input that contains the authentication that should be used to
     * generate the namespace.
     *
     * @return the authentication value.
     */
    public CustomLocationPropertiesAuthentication authentication() {
        return this.innerProperties() == null ? null : this.innerProperties().authentication();
    }

    /**
     * Set the authentication property: This is optional input that contains the authentication that should be used to
     * generate the namespace.
     *
     * @param authentication the authentication value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withAuthentication(CustomLocationPropertiesAuthentication authentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the clusterExtensionIds property: Contains the reference to the add-on that contains charts to deploy CRDs
     * and operators.
     *
     * @return the clusterExtensionIds value.
     */
    public List<String> clusterExtensionIds() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterExtensionIds();
    }

    /**
     * Set the clusterExtensionIds property: Contains the reference to the add-on that contains charts to deploy CRDs
     * and operators.
     *
     * @param clusterExtensionIds the clusterExtensionIds value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withClusterExtensionIds(List<String> clusterExtensionIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withClusterExtensionIds(clusterExtensionIds);
        return this;
    }

    /**
     * Get the displayName property: Display name for the Custom Locations location.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name for the Custom Locations location.
     *
     * @param displayName the displayName value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the hostResourceId property: Connected Cluster or AKS Cluster. The Custom Locations RP will perform a
     * checkAccess API for listAdminCredentials permissions.
     *
     * @return the hostResourceId value.
     */
    public String hostResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().hostResourceId();
    }

    /**
     * Set the hostResourceId property: Connected Cluster or AKS Cluster. The Custom Locations RP will perform a
     * checkAccess API for listAdminCredentials permissions.
     *
     * @param hostResourceId the hostResourceId value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withHostResourceId(String hostResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withHostResourceId(hostResourceId);
        return this;
    }

    /**
     * Get the hostType property: Type of host the Custom Locations is referencing (Kubernetes, etc...).
     *
     * @return the hostType value.
     */
    public HostType hostType() {
        return this.innerProperties() == null ? null : this.innerProperties().hostType();
    }

    /**
     * Set the hostType property: Type of host the Custom Locations is referencing (Kubernetes, etc...).
     *
     * @param hostType the hostType value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withHostType(HostType hostType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withHostType(hostType);
        return this;
    }

    /**
     * Get the namespace property: Kubernetes namespace that will be created on the specified cluster.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.innerProperties() == null ? null : this.innerProperties().namespace();
    }

    /**
     * Set the namespace property: Kubernetes namespace that will be created on the specified cluster.
     *
     * @param namespace the namespace value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withNamespace(String namespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withNamespace(namespace);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State for the Custom Location.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning State for the Custom Location.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PatchableCustomLocations object itself.
     */
    public PatchableCustomLocations withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomLocationProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
