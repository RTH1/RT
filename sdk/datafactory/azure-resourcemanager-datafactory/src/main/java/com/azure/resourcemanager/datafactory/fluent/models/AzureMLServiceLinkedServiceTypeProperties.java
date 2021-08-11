// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure ML Service linked service properties. */
@Fluent
public final class AzureMLServiceLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureMLServiceLinkedServiceTypeProperties.class);

    /*
     * Azure ML Service workspace subscription ID. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "subscriptionId", required = true)
    private Object subscriptionId;

    /*
     * Azure ML Service workspace resource group name. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "resourceGroupName", required = true)
    private Object resourceGroupName;

    /*
     * Azure ML Service workspace name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "mlWorkspaceName", required = true)
    private Object mlWorkspaceName;

    /*
     * The ID of the service principal used to authenticate against the
     * endpoint of a published Azure ML Service pipeline. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against the
     * endpoint of a published Azure ML Service pipeline.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     *
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     *
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     *
     * @return the mlWorkspaceName value.
     */
    public Object mlWorkspaceName() {
        return this.mlWorkspaceName;
    }

    /**
     * Set the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     *
     * @param mlWorkspaceName the mlWorkspaceName value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withMlWorkspaceName(Object mlWorkspaceName) {
        this.mlWorkspaceName = mlWorkspaceName;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint of
     * a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint of
     * a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureMLServiceLinkedServiceTypeProperties object itself.
     */
    public AzureMLServiceLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subscriptionId in model AzureMLServiceLinkedServiceTypeProperties"));
        }
        if (resourceGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceGroupName in model"
                            + " AzureMLServiceLinkedServiceTypeProperties"));
        }
        if (mlWorkspaceName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property mlWorkspaceName in model"
                            + " AzureMLServiceLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
    }
}
