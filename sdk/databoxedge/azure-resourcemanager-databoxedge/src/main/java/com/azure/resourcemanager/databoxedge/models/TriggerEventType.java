// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggerEventType. */
public final class TriggerEventType extends ExpandableStringEnum<TriggerEventType> {
    /** Static value FileEvent for TriggerEventType. */
    public static final TriggerEventType FILE_EVENT = fromString("FileEvent");

    /** Static value PeriodicTimerEvent for TriggerEventType. */
    public static final TriggerEventType PERIODIC_TIMER_EVENT = fromString("PeriodicTimerEvent");

    /**
     * Creates or finds a TriggerEventType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerEventType.
     */
    @JsonCreator
    public static TriggerEventType fromString(String name) {
        return fromString(name, TriggerEventType.class);
    }

    /** @return known TriggerEventType values. */
    public static Collection<TriggerEventType> values() {
        return values(TriggerEventType.class);
    }
}
