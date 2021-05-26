// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NodeCountInformations. */
public interface NodeCountInformations {
    /**
     * Retrieve counts for Dsc Nodes.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param countType The type of counts to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gets the count of nodes by count type.
     */
    NodeCounts get(String resourceGroupName, String automationAccountName, CountType countType);

    /**
     * Retrieve counts for Dsc Nodes.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param countType The type of counts to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gets the count of nodes by count type.
     */
    Response<NodeCounts> getWithResponse(
        String resourceGroupName, String automationAccountName, CountType countType, Context context);
}
