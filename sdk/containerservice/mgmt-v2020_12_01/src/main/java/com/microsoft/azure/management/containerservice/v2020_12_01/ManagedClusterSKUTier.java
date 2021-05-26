/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ManagedClusterSKUTier.
 */
public final class ManagedClusterSKUTier extends ExpandableStringEnum<ManagedClusterSKUTier> {
    /** Static value Paid for ManagedClusterSKUTier. */
    public static final ManagedClusterSKUTier PAID = fromString("Paid");

    /** Static value Free for ManagedClusterSKUTier. */
    public static final ManagedClusterSKUTier FREE = fromString("Free");

    /**
     * Creates or finds a ManagedClusterSKUTier from its string representation.
     * @param name a name to look for
     * @return the corresponding ManagedClusterSKUTier
     */
    @JsonCreator
    public static ManagedClusterSKUTier fromString(String name) {
        return fromString(name, ManagedClusterSKUTier.class);
    }

    /**
     * @return known ManagedClusterSKUTier values
     */
    public static Collection<ManagedClusterSKUTier> values() {
        return values(ManagedClusterSKUTier.class);
    }
}
