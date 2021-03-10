/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.TopLevelDomainsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TopLevelDomains.
 */
public interface TopLevelDomains extends SupportsListing<TopLevelDomain>, HasInner<TopLevelDomainsInner> {
    /**
     * Get details of a top-level domain.
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopLevelDomain> getAsync(String name);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TldLegalAgreement> listAgreementsAsync(final String name, final TopLevelDomainAgreementOption agreementOption);

}
