// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Expander. */
public final class Expander extends ExpandableStringEnum<Expander> {
    /** Static value least-waste for Expander. */
    public static final Expander LEAST_WASTE = fromString("least-waste");

    /** Static value most-pods for Expander. */
    public static final Expander MOST_PODS = fromString("most-pods");

    /** Static value priority for Expander. */
    public static final Expander PRIORITY = fromString("priority");

    /** Static value random for Expander. */
    public static final Expander RANDOM = fromString("random");

    /**
     * Creates or finds a Expander from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Expander.
     */
    @JsonCreator
    public static Expander fromString(String name) {
        return fromString(name, Expander.class);
    }

    /** @return known Expander values. */
    public static Collection<Expander> values() {
        return values(Expander.class);
    }
}
