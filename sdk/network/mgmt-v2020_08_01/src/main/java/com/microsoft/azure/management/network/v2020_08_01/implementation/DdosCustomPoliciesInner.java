/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.network.v2020_08_01.TagsObject;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DdosCustomPolicies.
 */
public class DdosCustomPoliciesInner implements InnerSupportsGet<DdosCustomPolicyInner>, InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private DdosCustomPoliciesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of DdosCustomPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DdosCustomPoliciesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(DdosCustomPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DdosCustomPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DdosCustomPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Body DdosCustomPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Body DdosCustomPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_08_01.DdosCustomPolicies updateTags" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ddosCustomPolicies/{ddosCustomPolicyName}")
        Observable<Response<ResponseBody>> updateTags(@Path("resourceGroupName") String resourceGroupName, @Path("ddosCustomPolicyName") String ddosCustomPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body TagsObject parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String ddosCustomPolicyName) {
        deleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).toBlocking().last().body();
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String ddosCustomPolicyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName), serviceCallback);
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String ddosCustomPolicyName) {
        return deleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-08-01";
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String ddosCustomPolicyName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).toBlocking().single().body();
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String ddosCustomPolicyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName), serviceCallback);
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String ddosCustomPolicyName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-08-01";
        return service.beginDelete(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DdosCustomPolicyInner object if successful.
     */
    public DdosCustomPolicyInner getByResourceGroup(String resourceGroupName, String ddosCustomPolicyName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).toBlocking().single().body();
    }

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DdosCustomPolicyInner> getByResourceGroupAsync(String resourceGroupName, String ddosCustomPolicyName, final ServiceCallback<DdosCustomPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName), serviceCallback);
    }

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<DdosCustomPolicyInner> getByResourceGroupAsync(String resourceGroupName, String ddosCustomPolicyName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).map(new Func1<ServiceResponse<DdosCustomPolicyInner>, DdosCustomPolicyInner>() {
            @Override
            public DdosCustomPolicyInner call(ServiceResponse<DdosCustomPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<ServiceResponse<DdosCustomPolicyInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-08-01";
        return service.getByResourceGroup(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DdosCustomPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DdosCustomPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DdosCustomPolicyInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DdosCustomPolicyInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DdosCustomPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DdosCustomPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DdosCustomPolicyInner object if successful.
     */
    public DdosCustomPolicyInner createOrUpdate(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DdosCustomPolicyInner> createOrUpdateAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters, final ServiceCallback<DdosCustomPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<DdosCustomPolicyInner> createOrUpdateAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters).map(new Func1<ServiceResponse<DdosCustomPolicyInner>, DdosCustomPolicyInner>() {
            @Override
            public DdosCustomPolicyInner call(ServiceResponse<DdosCustomPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<DdosCustomPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-08-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<DdosCustomPolicyInner>() { }.getType());
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DdosCustomPolicyInner object if successful.
     */
    public DdosCustomPolicyInner beginCreateOrUpdate(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DdosCustomPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters, final ServiceCallback<DdosCustomPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<DdosCustomPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, parameters).map(new Func1<ServiceResponse<DdosCustomPolicyInner>, DdosCustomPolicyInner>() {
            @Override
            public DdosCustomPolicyInner call(ServiceResponse<DdosCustomPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<ServiceResponse<DdosCustomPolicyInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-08-01";
        return service.beginCreateOrUpdate(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DdosCustomPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DdosCustomPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DdosCustomPolicyInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DdosCustomPolicyInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DdosCustomPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DdosCustomPolicyInner>() { }.getType())
                .register(201, new TypeToken<DdosCustomPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DdosCustomPolicyInner object if successful.
     */
    public DdosCustomPolicyInner updateTags(String resourceGroupName, String ddosCustomPolicyName) {
        return updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).toBlocking().single().body();
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DdosCustomPolicyInner> updateTagsAsync(String resourceGroupName, String ddosCustomPolicyName, final ServiceCallback<DdosCustomPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName), serviceCallback);
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<DdosCustomPolicyInner> updateTagsAsync(String resourceGroupName, String ddosCustomPolicyName) {
        return updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName).map(new Func1<ServiceResponse<DdosCustomPolicyInner>, DdosCustomPolicyInner>() {
            @Override
            public DdosCustomPolicyInner call(ServiceResponse<DdosCustomPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<ServiceResponse<DdosCustomPolicyInner>> updateTagsWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-08-01";
        final Map<String, String> tags = null;
        TagsObject parameters = new TagsObject();
        parameters.withTags(null);
        return service.updateTags(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DdosCustomPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DdosCustomPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DdosCustomPolicyInner> clientResponse = updateTagsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DdosCustomPolicyInner object if successful.
     */
    public DdosCustomPolicyInner updateTags(String resourceGroupName, String ddosCustomPolicyName, Map<String, String> tags) {
        return updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, tags).toBlocking().single().body();
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param tags Resource tags.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DdosCustomPolicyInner> updateTagsAsync(String resourceGroupName, String ddosCustomPolicyName, Map<String, String> tags, final ServiceCallback<DdosCustomPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, tags), serviceCallback);
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<DdosCustomPolicyInner> updateTagsAsync(String resourceGroupName, String ddosCustomPolicyName, Map<String, String> tags) {
        return updateTagsWithServiceResponseAsync(resourceGroupName, ddosCustomPolicyName, tags).map(new Func1<ServiceResponse<DdosCustomPolicyInner>, DdosCustomPolicyInner>() {
            @Override
            public DdosCustomPolicyInner call(ServiceResponse<DdosCustomPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DdosCustomPolicyInner object
     */
    public Observable<ServiceResponse<DdosCustomPolicyInner>> updateTagsWithServiceResponseAsync(String resourceGroupName, String ddosCustomPolicyName, Map<String, String> tags) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (ddosCustomPolicyName == null) {
            throw new IllegalArgumentException("Parameter ddosCustomPolicyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        Validator.validate(tags);
        final String apiVersion = "2020-08-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(resourceGroupName, ddosCustomPolicyName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DdosCustomPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<DdosCustomPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DdosCustomPolicyInner> clientResponse = updateTagsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DdosCustomPolicyInner> updateTagsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DdosCustomPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DdosCustomPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
