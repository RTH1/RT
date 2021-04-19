// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ActionType. */
public final class ActionType extends ExpandableStringEnum<ActionType> {
    /** Static value Allow for ActionType. */
    public static final ActionType ALLOW = fromString("Allow");

    /** Static value Block for ActionType. */
    public static final ActionType BLOCK = fromString("Block");

    /** Static value Log for ActionType. */
    public static final ActionType LOG = fromString("Log");

    /** Static value Redirect for ActionType. */
    public static final ActionType REDIRECT = fromString("Redirect");

    /**
     * Creates or finds a ActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActionType.
     */
    @JsonCreator
    public static ActionType fromString(String name) {
        return fromString(name, ActionType.class);
    }

    /** @return known ActionType values. */
    public static Collection<ActionType> values() {
        return values(ActionType.class);
    }
}
