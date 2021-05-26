// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AzureStorageState. */
public enum AzureStorageState {
    /** Enum value Ok. */
    OK("Ok"),

    /** Enum value InvalidCredentials. */
    INVALID_CREDENTIALS("InvalidCredentials"),

    /** Enum value InvalidShare. */
    INVALID_SHARE("InvalidShare"),

    /** Enum value NotValidated. */
    NOT_VALIDATED("NotValidated");

    /** The actual serialized value for a AzureStorageState instance. */
    private final String value;

    AzureStorageState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AzureStorageState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AzureStorageState object, or null if unable to parse.
     */
    @JsonCreator
    public static AzureStorageState fromString(String value) {
        AzureStorageState[] items = AzureStorageState.values();
        for (AzureStorageState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
