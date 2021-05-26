// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;

/** Contains all response data for the get operation. */
public final class InputsGetResponse extends ResponseBase<InputsGetHeaders, InputInner> {
    /**
     * Creates an instance of InputsGetResponse.
     *
     * @param request the request which resulted in this InputsGetResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public InputsGetResponse(
        HttpRequest request, int statusCode, HttpHeaders rawHeaders, InputInner value, InputsGetHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public InputInner getValue() {
        return super.getValue();
    }
}
