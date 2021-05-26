// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.confidentialledger;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JsonSerializerProviders;
import com.azure.core.util.serializer.ObjectSerializer;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the ConfidentialLedgerClient type. */
@ServiceClientBuilder(
        serviceClients = {ConfidentialLedgerBaseClient.class, ConfidentialLedgerIdentityServiceBaseClient.class})
public final class ConfidentialLedgerClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://confidential-ledger.azure.com/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the ConfidentialLedgerClientBuilder. */
    public ConfidentialLedgerClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The Confidential Ledger URL, for example
     * https://contoso.confidentialledger.azure.com
     */
    private URL ledgerUri;

    /**
     * Sets The Confidential Ledger URL, for example https://contoso.confidentialledger.azure.com.
     *
     * @param ledgerUri the ledgerUri value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder ledgerUri(URL ledgerUri) {
        this.ledgerUri = ledgerUri;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The Identity Service URL, for example
     * https://identity.accledger.azure.com
     */
    private URL identityServiceUri;

    /**
     * Sets The Identity Service URL, for example https://identity.accledger.azure.com.
     *
     * @param identityServiceUri the identityServiceUri value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder identityServiceUri(URL identityServiceUri) {
        this.identityServiceUri = identityServiceUri;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private ObjectSerializer serializer;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializer the serializer value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder serializer(ObjectSerializer serializer) {
        this.serializer = serializer;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    private TokenCredential tokenCredential;

    /**
     * Sets The TokenCredential used for authentication.
     *
     * @param tokenCredential the tokenCredential value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the ConfidentialLedgerClientBuilder.
     */
    public ConfidentialLedgerClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of ConfidentialLedgerBaseClient low level client.
     *
     * @return an instance of ConfidentialLedgerBaseClient.
     */
    public ConfidentialLedgerBaseClient buildConfidentialLedgerBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "0.1-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        ConfidentialLedgerBaseClient client =
                new ConfidentialLedgerBaseClient(ledgerUri, apiVersion, identityServiceUri, pipeline, serializer);
        return client;
    }

    /**
     * Builds an instance of ConfidentialLedgerIdentityServiceBaseClient low level client.
     *
     * @return an instance of ConfidentialLedgerIdentityServiceBaseClient.
     */
    public ConfidentialLedgerIdentityServiceBaseClient buildConfidentialLedgerIdentityServiceBaseClient() {
        if (apiVersion == null) {
            this.apiVersion = "0.1-preview";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializer == null) {
            this.serializer = JsonSerializerProviders.createInstance();
        }
        ConfidentialLedgerIdentityServiceBaseClient client =
                new ConfidentialLedgerIdentityServiceBaseClient(
                        ledgerUri, apiVersion, identityServiceUri, pipeline, serializer);
        return client;
    }
}
