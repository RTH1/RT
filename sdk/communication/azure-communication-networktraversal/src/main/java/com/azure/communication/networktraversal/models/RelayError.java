// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.networktraversal.models;

import com.azure.core.annotation.Immutable;
import java.util.List;

/** The Phone Number Services error. */
@Immutable
public final class RelayError {

    private final String code;

    private final String message;

    private final String target;

    private final List<RelayError> details;

    /**
     * Constructs a new RelayError
     * @param message The message of the original error
     * @param code The error code
     * @param target The target of the error
     * @param details Additional details
     */
    public RelayError(String message, String code, String target, List<RelayError> details) {
        this.message = message;
        this.code = code;
        this.target = target;
        this.details = details;
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: The error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: Further details about specific errors that led to this error.
     *
     * @return the details value.
     */
    public List<RelayError> getDetails() {
        return this.details;
    }
}
