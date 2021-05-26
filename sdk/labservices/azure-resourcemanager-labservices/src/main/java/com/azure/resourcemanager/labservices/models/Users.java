// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Users. */
public interface Users {
    /**
     * List users in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<User> list(String resourceGroupName, String labAccountName, String labName);

    /**
     * List users in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=email)'.
     * @param filter The filter to apply to the operation.
     * @param top The maximum number of resources to return from the operation.
     * @param orderby The ordering expression for the results, using OData notation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<User> list(
        String resourceGroupName,
        String labAccountName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param username The name of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user.
     */
    User get(String resourceGroupName, String labAccountName, String labName, String username);

    /**
     * Get user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param username The name of the user.
     * @param expand Specify the $expand query. Example: 'properties($select=email)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user.
     */
    Response<User> getWithResponse(
        String resourceGroupName,
        String labAccountName,
        String labName,
        String username,
        String expand,
        Context context);

    /**
     * Delete user. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param username The name of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labAccountName, String labName, String username);

    /**
     * Delete user. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param username The name of the user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labAccountName, String labName, String username, Context context);

    /**
     * Get user.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user.
     */
    User getById(String id);

    /**
     * Get user.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($select=email)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user.
     */
    Response<User> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete user. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete user. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new User resource.
     *
     * @param name resource name.
     * @return the first stage of the new User definition.
     */
    User.DefinitionStages.Blank define(String name);
}
