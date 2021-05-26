// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.AscOperationsClient;
import com.azure.resourcemanager.storagecache.fluent.models.AscOperationInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AscOperationsClient. */
public final class AscOperationsClientImpl implements AscOperationsClient {
    private final ClientLogger logger = new ClientLogger(AscOperationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AscOperationsService service;

    /** The service client containing this operation class. */
    private final StorageCacheManagementClientImpl client;

    /**
     * Initializes an instance of AscOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AscOperationsClientImpl(StorageCacheManagementClientImpl client) {
        this.service =
            RestProxy.create(AscOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageCacheManagementClientAscOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageCacheManageme")
    private interface AscOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.StorageCache/locations/{location}/ascOperations"
                + "/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AscOperationInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an asynchronous operation for the Azure HPC Cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AscOperationInner>> getWithResponseAsync(String location, String operationId) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            operationId,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an asynchronous operation for the Azure HPC Cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AscOperationInner>> getWithResponseAsync(
        String location, String operationId, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                operationId,
                accept,
                context);
    }

    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an asynchronous operation for the Azure HPC Cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AscOperationInner> getAsync(String location, String operationId) {
        return getWithResponseAsync(location, operationId)
            .flatMap(
                (Response<AscOperationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an asynchronous operation for the Azure HPC Cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AscOperationInner get(String location, String operationId) {
        return getAsync(location, operationId).block();
    }

    /**
     * Gets the status of an asynchronous operation for the Azure HPC Cache.
     *
     * @param location The name of the region used to look up the operation.
     * @param operationId The operation id which uniquely identifies the asynchronous operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an asynchronous operation for the Azure HPC Cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AscOperationInner> getWithResponse(String location, String operationId, Context context) {
        return getWithResponseAsync(location, operationId, context).block();
    }
}
