// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.resourcemanager.avs.fluent.models.QuotaInner;
import java.util.Map;

/** An immutable client-side representation of Quota. */
public interface Quota {
    /**
     * Gets the hostsRemaining property: Remaining hosts quota by sku type.
     *
     * @return the hostsRemaining value.
     */
    Map<String, Integer> hostsRemaining();

    /**
     * Gets the quotaEnabled property: Host quota is active for current subscription.
     *
     * @return the quotaEnabled value.
     */
    QuotaEnabled quotaEnabled();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.QuotaInner object.
     *
     * @return the inner object.
     */
    QuotaInner innerModel();
}
