// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphTeamsAsyncOperationStatus. */
public final class MicrosoftGraphTeamsAsyncOperationStatus
    extends ExpandableStringEnum<MicrosoftGraphTeamsAsyncOperationStatus> {
    /** Static value invalid for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus INVALID = fromString("invalid");

    /** Static value notStarted for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus NOT_STARTED = fromString("notStarted");

    /** Static value inProgress for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus IN_PROGRESS = fromString("inProgress");

    /** Static value succeeded for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus SUCCEEDED = fromString("succeeded");

    /** Static value failed for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus FAILED = fromString("failed");

    /** Static value unknownFutureValue for MicrosoftGraphTeamsAsyncOperationStatus. */
    public static final MicrosoftGraphTeamsAsyncOperationStatus UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphTeamsAsyncOperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTeamsAsyncOperationStatus.
     */
    @JsonCreator
    public static MicrosoftGraphTeamsAsyncOperationStatus fromString(String name) {
        return fromString(name, MicrosoftGraphTeamsAsyncOperationStatus.class);
    }

    /** @return known MicrosoftGraphTeamsAsyncOperationStatus values. */
    public static Collection<MicrosoftGraphTeamsAsyncOperationStatus> values() {
        return values(MicrosoftGraphTeamsAsyncOperationStatus.class);
    }
}
