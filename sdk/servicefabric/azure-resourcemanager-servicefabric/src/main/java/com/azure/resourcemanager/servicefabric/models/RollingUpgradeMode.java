// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RollingUpgradeMode. */
public final class RollingUpgradeMode extends ExpandableStringEnum<RollingUpgradeMode> {
    /** Static value Invalid for RollingUpgradeMode. */
    public static final RollingUpgradeMode INVALID = fromString("Invalid");

    /** Static value UnmonitoredAuto for RollingUpgradeMode. */
    public static final RollingUpgradeMode UNMONITORED_AUTO = fromString("UnmonitoredAuto");

    /** Static value UnmonitoredManual for RollingUpgradeMode. */
    public static final RollingUpgradeMode UNMONITORED_MANUAL = fromString("UnmonitoredManual");

    /** Static value Monitored for RollingUpgradeMode. */
    public static final RollingUpgradeMode MONITORED = fromString("Monitored");

    /**
     * Creates or finds a RollingUpgradeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RollingUpgradeMode.
     */
    @JsonCreator
    public static RollingUpgradeMode fromString(String name) {
        return fromString(name, RollingUpgradeMode.class);
    }

    /** @return known RollingUpgradeMode values. */
    public static Collection<RollingUpgradeMode> values() {
        return values(RollingUpgradeMode.class);
    }
}
