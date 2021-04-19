// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.RequestHistoryInner;

/**
 * An instance of this class provides access to all the operations defined in WorkflowRunActionRequestHistoriesClient.
 */
public interface WorkflowRunActionRequestHistoriesClient {
    /**
     * List a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RequestHistoryInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * List a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow request histories.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RequestHistoryInner> list(
        String resourceGroupName, String workflowName, String runName, String actionName, Context context);

    /**
     * Gets a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RequestHistoryInner get(
        String resourceGroupName, String workflowName, String runName, String actionName, String requestHistoryName);

    /**
     * Gets a workflow run request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param requestHistoryName The request history name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run request history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RequestHistoryInner> getWithResponse(
        String resourceGroupName,
        String workflowName,
        String runName,
        String actionName,
        String requestHistoryName,
        Context context);
}
