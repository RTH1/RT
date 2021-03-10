// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.VpnServerConfigurationsAssociatedWithVirtualWansClient;
import com.azure.resourcemanager.network.fluent.models.VpnServerConfigurationsResponseInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnServerConfigurationsAssociatedWithVirtualWansClient.
 */
public final class VpnServerConfigurationsAssociatedWithVirtualWansClientImpl
    implements VpnServerConfigurationsAssociatedWithVirtualWansClient {
    private final ClientLogger logger =
        new ClientLogger(VpnServerConfigurationsAssociatedWithVirtualWansClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final VpnServerConfigurationsAssociatedWithVirtualWansService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnServerConfigurationsAssociatedWithVirtualWansClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VpnServerConfigurationsAssociatedWithVirtualWansClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    VpnServerConfigurationsAssociatedWithVirtualWansService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnServerConfigurationsAssociatedWithVirtualWans to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface VpnServerConfigurationsAssociatedWithVirtualWansService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans"
                + "/{virtualWANName}/vpnServerConfigurations")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualWANName") String virtualWanName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> listWithResponseAsync(String resourceGroupName, String virtualWanName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualWanName,
                            apiVersion,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> listWithResponseAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        final String apiVersion = "2020-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualWanName,
                apiVersion,
                accept,
                context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner>
        beginListAsync(String resourceGroupName, String virtualWanName) {
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName);
        return this
            .client
            .<VpnServerConfigurationsResponseInner, VpnServerConfigurationsResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponseInner.class,
                VpnServerConfigurationsResponseInner.class,
                Context.NONE);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner>
        beginListAsync(String resourceGroupName, String virtualWanName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = listWithResponseAsync(resourceGroupName, virtualWanName, context);
        return this
            .client
            .<VpnServerConfigurationsResponseInner, VpnServerConfigurationsResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                VpnServerConfigurationsResponseInner.class,
                VpnServerConfigurationsResponseInner.class,
                context);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner> beginList(
        String resourceGroupName, String virtualWanName) {
        return beginListAsync(resourceGroupName, virtualWanName).getSyncPoller();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<VpnServerConfigurationsResponseInner>, VpnServerConfigurationsResponseInner> beginList(
        String resourceGroupName, String virtualWanName, Context context) {
        return beginListAsync(resourceGroupName, virtualWanName, context).getSyncPoller();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponseInner> listAsync(String resourceGroupName, String virtualWanName) {
        return beginListAsync(resourceGroupName, virtualWanName).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VpnServerConfigurationsResponseInner> listAsync(
        String resourceGroupName, String virtualWanName, Context context) {
        return beginListAsync(resourceGroupName, virtualWanName, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWanName) {
        return listAsync(resourceGroupName, virtualWanName).block();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN whose associated VpnServerConfigurations is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfigurations list associated with VirtualWan Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWanName, Context context) {
        return listAsync(resourceGroupName, virtualWanName, context).block();
    }
}
