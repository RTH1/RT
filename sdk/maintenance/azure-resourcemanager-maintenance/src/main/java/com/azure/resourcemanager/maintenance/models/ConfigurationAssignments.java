// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/** Resource collection API of ConfigurationAssignments. */
public interface ConfigurationAssignments {
    /**
     * Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    ConfigurationAssignment createOrUpdateParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment);

    /**
     * Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    Response<ConfigurationAssignment> createOrUpdateParentWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context);

    /**
     * Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    ConfigurationAssignment deleteParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName);

    /**
     * Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    Response<ConfigurationAssignment> deleteParentWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        Context context);

    /**
     * Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    ConfigurationAssignment createOrUpdate(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment);

    /**
     * Register configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Configuration assignment name.
     * @param configurationAssignment The configurationAssignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    Response<ConfigurationAssignment> createOrUpdateWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        ConfigurationAssignmentInner configurationAssignment,
        Context context);

    /**
     * Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    ConfigurationAssignment delete(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName);

    /**
     * Unregister configuration for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param configurationAssignmentName Unique configuration assignment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration Assignment.
     */
    Response<ConfigurationAssignment> deleteWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String configurationAssignmentName,
        Context context);

    /**
     * List configurationAssignments for resource.
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
     * @return response for ConfigurationAssignments list.
     */
    PagedIterable<ConfigurationAssignment> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName);

    /**
     * List configurationAssignments for resource.
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
     * @return response for ConfigurationAssignments list.
     */
    PagedIterable<ConfigurationAssignment> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        Context context);

    /**
     * List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list.
     */
    PagedIterable<ConfigurationAssignment> list(
        String resourceGroupName, String providerName, String resourceType, String resourceName);

    /**
     * List configurationAssignments for resource.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ConfigurationAssignments list.
     */
    PagedIterable<ConfigurationAssignment> list(
        String resourceGroupName, String providerName, String resourceType, String resourceName, Context context);
}
