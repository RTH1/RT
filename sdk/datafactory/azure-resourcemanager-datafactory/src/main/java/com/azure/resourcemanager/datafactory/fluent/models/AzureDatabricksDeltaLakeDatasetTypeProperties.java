// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Databricks Delta Lake Dataset Properties. */
@Fluent
public final class AzureDatabricksDeltaLakeDatasetTypeProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureDatabricksDeltaLakeDatasetTypeProperties.class);

    /*
     * The name of delta table. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "table")
    private Object table;

    /*
     * The database name of delta table. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "database")
    private Object database;

    /**
     * Get the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the AzureDatabricksDeltaLakeDatasetTypeProperties object itself.
     */
    public AzureDatabricksDeltaLakeDatasetTypeProperties withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the AzureDatabricksDeltaLakeDatasetTypeProperties object itself.
     */
    public AzureDatabricksDeltaLakeDatasetTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
