// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.security.attestation.implementation.PolicyCertificatesImpl;
import com.azure.security.attestation.models.PolicyCertificatesModifyResponse;
import com.azure.security.attestation.models.PolicyCertificatesResponse;

/** Initializes a new instance of the synchronous AzureAttestationRestClient type. */
@ServiceClient(builder = AttestationClientBuilder.class)
public final class PolicyCertificatesClient {
    private final PolicyCertificatesImpl serviceClient;

    /**
     * Initializes an instance of PolicyCertificates client.
     *
     * @param serviceClient the service client implementation.
     */
    PolicyCertificatesClient(PolicyCertificatesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesResponse get() {
        return PolicyCertificatesResponse.fromGenerated(serviceClient.get());
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesResponse> getWithResponse(Context context) {
        Response<com.azure.security.attestation.implementation.models.PolicyCertificatesResponse> response = serviceClient.getWithResponse(context);
        return Utilities.generateResponseFromModelType(response, PolicyCertificatesResponse.fromGenerated(response.getValue()));
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesModifyResponse add(String policyCertificateToAdd) {
        return PolicyCertificatesModifyResponse.fromGenerated(serviceClient.add(policyCertificateToAdd));
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesModifyResponse> addWithResponse(String policyCertificateToAdd, Context context) {
        Response<com.azure.security.attestation.implementation.models.PolicyCertificatesModifyResponse> response = this.serviceClient.addWithResponse(policyCertificateToAdd, context);
        return Utilities.generateResponseFromModelType(response, PolicyCertificatesModifyResponse.fromGenerated(response.getValue()));
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesModifyResponse remove(String policyCertificateToRemove) {
        return PolicyCertificatesModifyResponse.fromGenerated(serviceClient.remove(policyCertificateToRemove));
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesModifyResponse> removeWithResponse(
            String policyCertificateToRemove, Context context) {
        Response<com.azure.security.attestation.implementation.models.PolicyCertificatesModifyResponse> response = this.serviceClient.removeWithResponse(policyCertificateToRemove, context);
        return Utilities.generateResponseFromModelType(response, PolicyCertificatesModifyResponse.fromGenerated(response.getValue()));

    }
}
