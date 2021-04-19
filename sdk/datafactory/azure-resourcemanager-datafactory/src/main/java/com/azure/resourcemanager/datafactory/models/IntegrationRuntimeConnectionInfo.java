// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeConnectionInfoInner;
import java.util.Map;

/** An immutable client-side representation of IntegrationRuntimeConnectionInfo. */
public interface IntegrationRuntimeConnectionInfo {
    /**
     * Gets the serviceToken property: The token generated in service. Callers use this token to authenticate to
     * integration runtime.
     *
     * @return the serviceToken value.
     */
    String serviceToken();

    /**
     * Gets the identityCertThumbprint property: The integration runtime SSL certificate thumbprint. Click-Once
     * application uses it to do server validation.
     *
     * @return the identityCertThumbprint value.
     */
    String identityCertThumbprint();

    /**
     * Gets the hostServiceUri property: The on-premises integration runtime host URL.
     *
     * @return the hostServiceUri value.
     */
    String hostServiceUri();

    /**
     * Gets the version property: The integration runtime version.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the publicKey property: The public key for encrypting a credential when transferring the credential to the
     * integration runtime.
     *
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * Gets the isIdentityCertExprired property: Whether the identity certificate is expired.
     *
     * @return the isIdentityCertExprired value.
     */
    Boolean isIdentityCertExprired();

    /**
     * Gets the additionalProperties property: Connection information for encrypting the on-premises data source
     * credentials.
     *
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeConnectionInfoInner object.
     *
     * @return the inner object.
     */
    IntegrationRuntimeConnectionInfoInner innerModel();
}
