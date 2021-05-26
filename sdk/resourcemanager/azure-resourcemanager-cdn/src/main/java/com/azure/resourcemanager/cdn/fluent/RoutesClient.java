// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.fluent.models.RouteInner;
import com.azure.resourcemanager.cdn.models.RouteUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoutesClient. */
public interface RoutesClient {
    /**
     * Lists all of the existing origins within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list routes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteInner> listByEndpointAsync(String resourceGroupName, String profileName, String endpointName);

    /**
     * Lists all of the existing origins within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list routes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteInner> listByEndpoint(String resourceGroupName, String profileName, String endpointName);

    /**
     * Lists all of the existing origins within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list routes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteInner> listByEndpoint(
        String resourceGroupName, String profileName, String endpointName, Context context);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteInner>> getWithResponseAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteInner> getAsync(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteInner get(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Gets an existing route with the specified route name under the specified subscription, resource group, profile,
     * and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing route with the specified route name under the specified subscription, resource group,
     *     profile, and AzureFrontDoor endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RouteInner> getWithResponse(
        String resourceGroupName, String profileName, String endpointName, String routeName, Context context);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName, RouteInner route);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteInner>, RouteInner> beginCreateAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName, RouteInner route);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteInner>, RouteInner> beginCreate(
        String resourceGroupName, String profileName, String endpointName, String routeName, RouteInner route);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteInner>, RouteInner> beginCreate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteInner route,
        Context context);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteInner> createAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName, RouteInner route);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteInner create(
        String resourceGroupName, String profileName, String endpointName, String routeName, RouteInner route);

    /**
     * Creates a new route with the specified route name under the specified subscription, resource group, profile, and
     * AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param route Route properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteInner create(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteInner route,
        Context context);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteInner>, RouteInner> beginUpdateAsync(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteInner>, RouteInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteInner>, RouteInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties,
        Context context);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteInner> updateAsync(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties);

    /**
     * Updates an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param routeUpdateProperties Route update properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Routes name mapping to the any Routes or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteInner update(
        String resourceGroupName,
        String profileName,
        String endpointName,
        String routeName,
        RouteUpdateParameters routeUpdateProperties,
        Context context);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String endpointName, String routeName, Context context);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName, String routeName);

    /**
     * Deletes an existing route with the specified route name under the specified subscription, resource group,
     * profile, and AzureFrontDoor endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param routeName Name of the routing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String endpointName, String routeName, Context context);
}
