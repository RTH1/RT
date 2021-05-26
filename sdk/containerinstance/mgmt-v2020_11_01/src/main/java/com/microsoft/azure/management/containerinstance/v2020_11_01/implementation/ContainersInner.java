/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.containerinstance.v2020_11_01.ContainerExecRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Containers.
 */
public class ContainersInner {
    /** The Retrofit service to perform REST calls. */
    private ContainersService service;
    /** The service client containing this operation class. */
    private ContainerInstanceManagementClientImpl client;

    /**
     * Initializes an instance of ContainersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ContainersInner(Retrofit retrofit, ContainerInstanceManagementClientImpl client) {
        this.service = retrofit.create(ContainersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Containers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ContainersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.v2020_11_01.Containers listLogs" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerInstance/containerGroups/{containerGroupName}/containers/{containerName}/logs")
        Observable<Response<ResponseBody>> listLogs(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("containerGroupName") String containerGroupName, @Path("containerName") String containerName, @Query("api-version") String apiVersion, @Query("tail") Integer tail, @Query("timestamps") Boolean timestamps, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.v2020_11_01.Containers executeCommand" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerInstance/containerGroups/{containerGroupName}/containers/{containerName}/exec")
        Observable<Response<ResponseBody>> executeCommand(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("containerGroupName") String containerGroupName, @Path("containerName") String containerName, @Query("api-version") String apiVersion, @Body ContainerExecRequest containerExecRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.containerinstance.v2020_11_01.Containers attach" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.ContainerInstance/containerGroups/{containerGroupName}/containers/{containerName}/attach")
        Observable<Response<ResponseBody>> attach(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("containerGroupName") String containerGroupName, @Path("containerName") String containerName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogsInner object if successful.
     */
    public LogsInner listLogs(String resourceGroupName, String containerGroupName, String containerName) {
        return listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName).toBlocking().single().body();
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogsInner> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName, final ServiceCallback<LogsInner> serviceCallback) {
        return ServiceFuture.fromResponse(listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName), serviceCallback);
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogsInner object
     */
    public Observable<LogsInner> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName) {
        return listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName).map(new Func1<ServiceResponse<LogsInner>, LogsInner>() {
            @Override
            public LogsInner call(ServiceResponse<LogsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogsInner object
     */
    public Observable<ServiceResponse<LogsInner>> listLogsWithServiceResponseAsync(String resourceGroupName, String containerGroupName, String containerName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (containerGroupName == null) {
            throw new IllegalArgumentException("Parameter containerGroupName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer tail = null;
        final Boolean timestamps = null;
        return service.listLogs(this.client.subscriptionId(), resourceGroupName, containerGroupName, containerName, this.client.apiVersion(), tail, timestamps, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LogsInner>>>() {
                @Override
                public Observable<ServiceResponse<LogsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LogsInner> clientResponse = listLogsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all available logs are shown up to 4mb.
     * @param timestamps If true, adds a timestamp at the beginning of every line of log output. If not provided, defaults to false.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogsInner object if successful.
     */
    public LogsInner listLogs(String resourceGroupName, String containerGroupName, String containerName, Integer tail, Boolean timestamps) {
        return listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, tail, timestamps).toBlocking().single().body();
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all available logs are shown up to 4mb.
     * @param timestamps If true, adds a timestamp at the beginning of every line of log output. If not provided, defaults to false.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogsInner> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName, Integer tail, Boolean timestamps, final ServiceCallback<LogsInner> serviceCallback) {
        return ServiceFuture.fromResponse(listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, tail, timestamps), serviceCallback);
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all available logs are shown up to 4mb.
     * @param timestamps If true, adds a timestamp at the beginning of every line of log output. If not provided, defaults to false.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogsInner object
     */
    public Observable<LogsInner> listLogsAsync(String resourceGroupName, String containerGroupName, String containerName, Integer tail, Boolean timestamps) {
        return listLogsWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, tail, timestamps).map(new Func1<ServiceResponse<LogsInner>, LogsInner>() {
            @Override
            public LogsInner call(ServiceResponse<LogsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the logs for a specified container instance.
     * Get the logs for a specified container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param tail The number of lines to show from the tail of the container instance log. If not provided, all available logs are shown up to 4mb.
     * @param timestamps If true, adds a timestamp at the beginning of every line of log output. If not provided, defaults to false.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogsInner object
     */
    public Observable<ServiceResponse<LogsInner>> listLogsWithServiceResponseAsync(String resourceGroupName, String containerGroupName, String containerName, Integer tail, Boolean timestamps) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (containerGroupName == null) {
            throw new IllegalArgumentException("Parameter containerGroupName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listLogs(this.client.subscriptionId(), resourceGroupName, containerGroupName, containerName, this.client.apiVersion(), tail, timestamps, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LogsInner>>>() {
                @Override
                public Observable<ServiceResponse<LogsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LogsInner> clientResponse = listLogsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LogsInner> listLogsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LogsInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LogsInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Executes a command in a specific container instance.
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContainerExecResponseInner object if successful.
     */
    public ContainerExecResponseInner executeCommand(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest) {
        return executeCommandWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest).toBlocking().single().body();
    }

    /**
     * Executes a command in a specific container instance.
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContainerExecResponseInner> executeCommandAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest, final ServiceCallback<ContainerExecResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(executeCommandWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest), serviceCallback);
    }

    /**
     * Executes a command in a specific container instance.
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerExecResponseInner object
     */
    public Observable<ContainerExecResponseInner> executeCommandAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest) {
        return executeCommandWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName, containerExecRequest).map(new Func1<ServiceResponse<ContainerExecResponseInner>, ContainerExecResponseInner>() {
            @Override
            public ContainerExecResponseInner call(ServiceResponse<ContainerExecResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Executes a command in a specific container instance.
     * Executes a command for a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param containerExecRequest The request for the exec command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerExecResponseInner object
     */
    public Observable<ServiceResponse<ContainerExecResponseInner>> executeCommandWithServiceResponseAsync(String resourceGroupName, String containerGroupName, String containerName, ContainerExecRequest containerExecRequest) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (containerGroupName == null) {
            throw new IllegalArgumentException("Parameter containerGroupName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (containerExecRequest == null) {
            throw new IllegalArgumentException("Parameter containerExecRequest is required and cannot be null.");
        }
        Validator.validate(containerExecRequest);
        return service.executeCommand(this.client.subscriptionId(), resourceGroupName, containerGroupName, containerName, this.client.apiVersion(), containerExecRequest, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContainerExecResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<ContainerExecResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContainerExecResponseInner> clientResponse = executeCommandDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ContainerExecResponseInner> executeCommandDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ContainerExecResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ContainerExecResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Attach to the output of a specific container instance.
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContainerAttachResponseInner object if successful.
     */
    public ContainerAttachResponseInner attach(String resourceGroupName, String containerGroupName, String containerName) {
        return attachWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName).toBlocking().single().body();
    }

    /**
     * Attach to the output of a specific container instance.
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContainerAttachResponseInner> attachAsync(String resourceGroupName, String containerGroupName, String containerName, final ServiceCallback<ContainerAttachResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(attachWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName), serviceCallback);
    }

    /**
     * Attach to the output of a specific container instance.
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerAttachResponseInner object
     */
    public Observable<ContainerAttachResponseInner> attachAsync(String resourceGroupName, String containerGroupName, String containerName) {
        return attachWithServiceResponseAsync(resourceGroupName, containerGroupName, containerName).map(new Func1<ServiceResponse<ContainerAttachResponseInner>, ContainerAttachResponseInner>() {
            @Override
            public ContainerAttachResponseInner call(ServiceResponse<ContainerAttachResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Attach to the output of a specific container instance.
     * Attach to the output stream of a specific container instance in a specified resource group and container group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerName The name of the container instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContainerAttachResponseInner object
     */
    public Observable<ServiceResponse<ContainerAttachResponseInner>> attachWithServiceResponseAsync(String resourceGroupName, String containerGroupName, String containerName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (containerGroupName == null) {
            throw new IllegalArgumentException("Parameter containerGroupName is required and cannot be null.");
        }
        if (containerName == null) {
            throw new IllegalArgumentException("Parameter containerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.attach(this.client.subscriptionId(), resourceGroupName, containerGroupName, containerName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContainerAttachResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<ContainerAttachResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContainerAttachResponseInner> clientResponse = attachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ContainerAttachResponseInner> attachDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ContainerAttachResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ContainerAttachResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
