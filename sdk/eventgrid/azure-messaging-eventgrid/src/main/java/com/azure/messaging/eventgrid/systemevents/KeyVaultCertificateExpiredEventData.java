// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a Microsoft.KeyVault.CertificateExpired event. */
@Fluent
public final class KeyVaultCertificateExpiredEventData {
    /*
     * The id of the object that triggered this event.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Key vault name of the object that triggered this event.
     */
    @JsonProperty(value = "vaultName")
    private String vaultName;

    /*
     * The type of the object that triggered this event
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /*
     * The name of the object that triggered this event
     */
    @JsonProperty(value = "objectName")
    private String objectName;

    /*
     * The version of the object that triggered this event
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Not before date of the object that triggered this event
     */
    @JsonProperty(value = "nbf")
    private Float nbf;

    /*
     * The expiration date of the object that triggered this event
     */
    @JsonProperty(value = "exp")
    private Float exp;

    /**
     * Get the id property: The id of the object that triggered this event.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the object that triggered this event.
     *
     * @param id the id value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the vaultName property: Key vault name of the object that triggered this event.
     *
     * @return the vaultName value.
     */
    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: Key vault name of the object that triggered this event.
     *
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the objectType property: The type of the object that triggered this event.
     *
     * @return the objectType value.
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The type of the object that triggered this event.
     *
     * @param objectType the objectType value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the objectName property: The name of the object that triggered this event.
     *
     * @return the objectName value.
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Set the objectName property: The name of the object that triggered this event.
     *
     * @param objectName the objectName value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * Get the version property: The version of the object that triggered this event.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the object that triggered this event.
     *
     * @param version the version value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the nbf property: Not before date of the object that triggered this event.
     *
     * @return the nbf value.
     */
    public Float getNbf() {
        return this.nbf;
    }

    /**
     * Set the nbf property: Not before date of the object that triggered this event.
     *
     * @param nbf the nbf value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setNbf(Float nbf) {
        this.nbf = nbf;
        return this;
    }

    /**
     * Get the exp property: The expiration date of the object that triggered this event.
     *
     * @return the exp value.
     */
    public Float getExp() {
        return this.exp;
    }

    /**
     * Set the exp property: The expiration date of the object that triggered this event.
     *
     * @param exp the exp value to set.
     * @return the KeyVaultCertificateExpiredEventData object itself.
     */
    public KeyVaultCertificateExpiredEventData setExp(Float exp) {
        this.exp = exp;
        return this;
    }
}
