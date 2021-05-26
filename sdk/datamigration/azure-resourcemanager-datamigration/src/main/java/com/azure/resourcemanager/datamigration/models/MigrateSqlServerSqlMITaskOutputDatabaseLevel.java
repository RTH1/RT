// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** The MigrateSqlServerSqlMITaskOutputDatabaseLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
@Immutable
public final class MigrateSqlServerSqlMITaskOutputDatabaseLevel extends MigrateSqlServerSqlMITaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigrateSqlServerSqlMITaskOutputDatabaseLevel.class);

    /*
     * Name of the database
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Size of the database in megabytes
     */
    @JsonProperty(value = "sizeMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double sizeMB;

    /*
     * Current state of migration
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /*
     * Current stage of migration
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseMigrationStage stage;

    /*
     * Migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Migration progress message
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Migration exceptions and warnings
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get the databaseName property: Name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the sizeMB property: Size of the database in megabytes.
     *
     * @return the sizeMB value.
     */
    public Double sizeMB() {
        return this.sizeMB;
    }

    /**
     * Get the state property: Current state of migration.
     *
     * @return the state value.
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get the stage property: Current stage of migration.
     *
     * @return the stage value.
     */
    public DatabaseMigrationStage stage() {
        return this.stage;
    }

    /**
     * Get the startedOn property: Migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the message property: Migration progress message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the exceptionsAndWarnings property: Migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value.
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (exceptionsAndWarnings() != null) {
            exceptionsAndWarnings().forEach(e -> e.validate());
        }
    }
}
