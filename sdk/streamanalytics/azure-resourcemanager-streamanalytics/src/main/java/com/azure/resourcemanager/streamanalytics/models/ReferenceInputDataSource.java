// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an input data source that contains reference data. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ReferenceInputDataSource.class)
@JsonTypeName("ReferenceInputDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Storage/Blob", value = BlobReferenceInputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/Server/Database", value = AzureSqlReferenceInputDataSource.class)
})
@Immutable
public class ReferenceInputDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReferenceInputDataSource.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
