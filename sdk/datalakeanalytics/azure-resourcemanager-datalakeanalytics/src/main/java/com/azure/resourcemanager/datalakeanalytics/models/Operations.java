// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * Lists all of the available Data Lake Analytics REST API operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available operations for Data Lake Analytics.
     */
    OperationListResult list();

    /**
     * Lists all of the available Data Lake Analytics REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available operations for Data Lake Analytics.
     */
    Response<OperationListResult> listWithResponse(Context context);
}
