// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.resourcemanager.hybridnetwork.fluent.models.SkuOverviewInner;

/** An immutable client-side representation of SkuOverview. */
public interface SkuOverview {
    /**
     * Gets the skuName property: The vendor sku name.
     *
     * @return the skuName value.
     */
    String skuName();

    /**
     * Gets the skuType property: The vendor sku type.
     *
     * @return the skuType value.
     */
    SkuType skuType();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.SkuOverviewInner object.
     *
     * @return the inner object.
     */
    SkuOverviewInner innerModel();
}
