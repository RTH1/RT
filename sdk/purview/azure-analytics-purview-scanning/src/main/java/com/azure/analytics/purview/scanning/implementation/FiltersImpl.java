// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.implementation;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Filters. */
public final class FiltersImpl {
    /** The proxy service used to perform REST calls. */
    private final FiltersService service;

    /** The service client containing this operation class. */
    private final PurviewScanningClientImpl client;

    /**
     * Initializes an instance of FiltersImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FiltersImpl(PurviewScanningClientImpl client) {
        this.service = RestProxy.create(FiltersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewScanningClientFilters to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{Endpoint}")
    @ServiceInterface(name = "PurviewScanningClien")
    private interface FiltersService {
        @Get("/datasources/{dataSourceName}/scans/{scanName}/filters/custom")
        Mono<Response<BinaryData>> get(
                @HostParam("Endpoint") String endpoint,
                @PathParam("dataSourceName") String dataSourceName,
                @PathParam("scanName") String scanName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Put("/datasources/{dataSourceName}/scans/{scanName}/filters/custom")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("Endpoint") String endpoint,
                @PathParam("dataSourceName") String dataSourceName,
                @PathParam("scanName") String scanName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String dataSourceName, String scanName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getEndpoint(),
                                dataSourceName,
                                scanName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * Get a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String dataSourceName, String scanName, RequestOptions requestOptions, Context context) {
        return service.get(
                this.client.getEndpoint(),
                dataSourceName,
                scanName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * Get a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String dataSourceName, String scanName, RequestOptions requestOptions, Context context) {
        return getWithResponseAsync(dataSourceName, scanName, requestOptions, context).block();
    }

    /**
     * Creates or updates a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String dataSourceName, String scanName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getEndpoint(),
                                dataSourceName,
                                scanName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * Creates or updates a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String dataSourceName, String scanName, RequestOptions requestOptions, Context context) {
        return service.createOrUpdate(
                this.client.getEndpoint(),
                dataSourceName,
                scanName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * Creates or updates a filter.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     properties: {
     *         excludeUriPrefixes: [
     *             String
     *         ]
     *         includeUriPrefixes: [
     *             String
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param dataSourceName The dataSourceName parameter.
     * @param scanName The scanName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String dataSourceName, String scanName, RequestOptions requestOptions, Context context) {
        return createOrUpdateWithResponseAsync(dataSourceName, scanName, requestOptions, context).block();
    }
}
