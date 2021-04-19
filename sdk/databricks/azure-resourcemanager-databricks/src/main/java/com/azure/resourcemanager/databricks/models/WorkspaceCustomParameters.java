// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Custom Parameters used for Cluster Creation. */
@Fluent
public final class WorkspaceCustomParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceCustomParameters.class);

    /*
     * The ID of a Azure Machine Learning workspace to link with Databricks
     * workspace
     */
    @JsonProperty(value = "amlWorkspaceId")
    private WorkspaceCustomStringParameter amlWorkspaceId;

    /*
     * The ID of a Virtual Network where this Databricks Cluster should be
     * created
     */
    @JsonProperty(value = "customVirtualNetworkId")
    private WorkspaceCustomStringParameter customVirtualNetworkId;

    /*
     * The name of a Public Subnet within the Virtual Network
     */
    @JsonProperty(value = "customPublicSubnetName")
    private WorkspaceCustomStringParameter customPublicSubnetName;

    /*
     * The name of the Private Subnet within the Virtual Network
     */
    @JsonProperty(value = "customPrivateSubnetName")
    private WorkspaceCustomStringParameter customPrivateSubnetName;

    /*
     * Should the Public IP be Disabled?
     */
    @JsonProperty(value = "enableNoPublicIp")
    private WorkspaceCustomBooleanParameter enableNoPublicIp;

    /*
     * Prepare the workspace for encryption. Enables the Managed Identity for
     * managed storage account.
     */
    @JsonProperty(value = "prepareEncryption")
    private WorkspaceCustomBooleanParameter prepareEncryption;

    /*
     * Contains the encryption details for Customer-Managed Key (CMK) enabled
     * workspace.
     */
    @JsonProperty(value = "encryption")
    private WorkspaceEncryptionParameter encryption;

    /*
     * A boolean indicating whether or not the DBFS root file system will be
     * enabled with secondary layer of encryption with platform managed keys
     * for data at rest.
     */
    @JsonProperty(value = "requireInfrastructureEncryption")
    private WorkspaceCustomBooleanParameter requireInfrastructureEncryption;

    /**
     * Get the amlWorkspaceId property: The ID of a Azure Machine Learning workspace to link with Databricks workspace.
     *
     * @return the amlWorkspaceId value.
     */
    public WorkspaceCustomStringParameter amlWorkspaceId() {
        return this.amlWorkspaceId;
    }

    /**
     * Set the amlWorkspaceId property: The ID of a Azure Machine Learning workspace to link with Databricks workspace.
     *
     * @param amlWorkspaceId the amlWorkspaceId value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withAmlWorkspaceId(WorkspaceCustomStringParameter amlWorkspaceId) {
        this.amlWorkspaceId = amlWorkspaceId;
        return this;
    }

    /**
     * Get the customVirtualNetworkId property: The ID of a Virtual Network where this Databricks Cluster should be
     * created.
     *
     * @return the customVirtualNetworkId value.
     */
    public WorkspaceCustomStringParameter customVirtualNetworkId() {
        return this.customVirtualNetworkId;
    }

    /**
     * Set the customVirtualNetworkId property: The ID of a Virtual Network where this Databricks Cluster should be
     * created.
     *
     * @param customVirtualNetworkId the customVirtualNetworkId value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withCustomVirtualNetworkId(WorkspaceCustomStringParameter customVirtualNetworkId) {
        this.customVirtualNetworkId = customVirtualNetworkId;
        return this;
    }

    /**
     * Get the customPublicSubnetName property: The name of a Public Subnet within the Virtual Network.
     *
     * @return the customPublicSubnetName value.
     */
    public WorkspaceCustomStringParameter customPublicSubnetName() {
        return this.customPublicSubnetName;
    }

    /**
     * Set the customPublicSubnetName property: The name of a Public Subnet within the Virtual Network.
     *
     * @param customPublicSubnetName the customPublicSubnetName value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withCustomPublicSubnetName(WorkspaceCustomStringParameter customPublicSubnetName) {
        this.customPublicSubnetName = customPublicSubnetName;
        return this;
    }

    /**
     * Get the customPrivateSubnetName property: The name of the Private Subnet within the Virtual Network.
     *
     * @return the customPrivateSubnetName value.
     */
    public WorkspaceCustomStringParameter customPrivateSubnetName() {
        return this.customPrivateSubnetName;
    }

    /**
     * Set the customPrivateSubnetName property: The name of the Private Subnet within the Virtual Network.
     *
     * @param customPrivateSubnetName the customPrivateSubnetName value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withCustomPrivateSubnetName(
        WorkspaceCustomStringParameter customPrivateSubnetName) {
        this.customPrivateSubnetName = customPrivateSubnetName;
        return this;
    }

    /**
     * Get the enableNoPublicIp property: Should the Public IP be Disabled?.
     *
     * @return the enableNoPublicIp value.
     */
    public WorkspaceCustomBooleanParameter enableNoPublicIp() {
        return this.enableNoPublicIp;
    }

    /**
     * Set the enableNoPublicIp property: Should the Public IP be Disabled?.
     *
     * @param enableNoPublicIp the enableNoPublicIp value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withEnableNoPublicIp(WorkspaceCustomBooleanParameter enableNoPublicIp) {
        this.enableNoPublicIp = enableNoPublicIp;
        return this;
    }

    /**
     * Get the prepareEncryption property: Prepare the workspace for encryption. Enables the Managed Identity for
     * managed storage account.
     *
     * @return the prepareEncryption value.
     */
    public WorkspaceCustomBooleanParameter prepareEncryption() {
        return this.prepareEncryption;
    }

    /**
     * Set the prepareEncryption property: Prepare the workspace for encryption. Enables the Managed Identity for
     * managed storage account.
     *
     * @param prepareEncryption the prepareEncryption value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withPrepareEncryption(WorkspaceCustomBooleanParameter prepareEncryption) {
        this.prepareEncryption = prepareEncryption;
        return this;
    }

    /**
     * Get the encryption property: Contains the encryption details for Customer-Managed Key (CMK) enabled workspace.
     *
     * @return the encryption value.
     */
    public WorkspaceEncryptionParameter encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Contains the encryption details for Customer-Managed Key (CMK) enabled workspace.
     *
     * @param encryption the encryption value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withEncryption(WorkspaceEncryptionParameter encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: A boolean indicating whether or not the DBFS root file system
     * will be enabled with secondary layer of encryption with platform managed keys for data at rest.
     *
     * @return the requireInfrastructureEncryption value.
     */
    public WorkspaceCustomBooleanParameter requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: A boolean indicating whether or not the DBFS root file system
     * will be enabled with secondary layer of encryption with platform managed keys for data at rest.
     *
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the WorkspaceCustomParameters object itself.
     */
    public WorkspaceCustomParameters withRequireInfrastructureEncryption(
        WorkspaceCustomBooleanParameter requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (amlWorkspaceId() != null) {
            amlWorkspaceId().validate();
        }
        if (customVirtualNetworkId() != null) {
            customVirtualNetworkId().validate();
        }
        if (customPublicSubnetName() != null) {
            customPublicSubnetName().validate();
        }
        if (customPrivateSubnetName() != null) {
            customPrivateSubnetName().validate();
        }
        if (enableNoPublicIp() != null) {
            enableNoPublicIp().validate();
        }
        if (prepareEncryption() != null) {
            prepareEncryption().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (requireInfrastructureEncryption() != null) {
            requireInfrastructureEncryption().validate();
        }
    }
}
