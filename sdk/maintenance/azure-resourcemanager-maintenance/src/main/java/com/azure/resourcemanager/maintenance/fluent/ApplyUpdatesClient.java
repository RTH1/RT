// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;

/** An instance of this class provides access to all the operations defined in ApplyUpdatesClient. */
public interface ApplyUpdatesClient {
    /**
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param applyUpdateName applyUpdate Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplyUpdateInner getParent(
        String resourceGroupName,
        String resourceParentType,
        String resourceParentName,
        String providerName,
        String resourceType,
        String resourceName,
        String applyUpdateName);

    /**
     * Track maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param applyUpdateName applyUpdate Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplyUpdateInner> getParentWithResponse(
        String resourceGroupName,
        String resourceParentType,
        String resourceParentName,
        String providerName,
        String resourceType,
        String resourceName,
        String applyUpdateName,
        Context context);

    /**
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param applyUpdateName applyUpdate Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplyUpdateInner get(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String applyUpdateName);

    /**
     * Track maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param applyUpdateName applyUpdate Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplyUpdateInner> getWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String applyUpdateName,
        Context context);

    /**
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplyUpdateInner createOrUpdateParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName);

    /**
     * Apply maintenance updates to resource with parent.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplyUpdateInner> createOrUpdateParentWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        Context context);

    /**
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplyUpdateInner createOrUpdate(
        String resourceGroupName, String providerName, String resourceType, String resourceName);

    /**
     * Apply maintenance updates to resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apply Update request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplyUpdateInner> createOrUpdateWithResponse(
        String resourceGroupName, String providerName, String resourceType, String resourceName, Context context);
}
