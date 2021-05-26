// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner;

/** An immutable client-side representation of DataLakeStoreAccountInformation. */
public interface DataLakeStoreAccountInformation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the suffix property: The optional suffix for the Data Lake Store account.
     *
     * @return the suffix value.
     */
    String suffix();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner
     * object.
     *
     * @return the inner object.
     */
    DataLakeStoreAccountInformationInner innerModel();
}
