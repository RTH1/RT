// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http;

/**
 * The different values that commonly used for Content-Type header.
 */
public final class ContentType {
    /**
     * The default JSON Content-Type header.
     */
    public static final String APPLICATION_JSON = "application/json";

    /**
     * The default binary Content-Type header.
     */
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

    /**
     * The default form data Content-Type header.
     */
    public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";

    /**
     * The default multipart form data Content-Type header.
     */
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    /**
     * The default text Content-Type header.
     */
    public static final String TEXT_PLAIN = "text/plain";

    /**
     * Private ctr.
     */
    private ContentType() {
    }
}
