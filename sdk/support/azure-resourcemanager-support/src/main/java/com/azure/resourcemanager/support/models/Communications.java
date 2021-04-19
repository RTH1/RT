// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Communications. */
public interface Communications {
    /**
     * Check the availability of a resource name. This API should be used to check the uniqueness of the name for adding
     * a new communication to the support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    CheckNameAvailabilityOutput checkNameAvailability(
        String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Check the availability of a resource name. This API should be used to check the uniqueness of the name for adding
     * a new communication to the support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithResponse(
        String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Lists all communications (attachments not included) for a support ticket. &lt;br/&gt;&lt;/br&gt; You can also
     * filter support ticket communications by _CreatedDate_ or _CommunicationType_ using the $filter parameter. The
     * only type of communication supported today is _Web_. Output will be a paged result with _nextLink_, using which
     * you can retrieve the next set of Communication results. &lt;br/&gt;&lt;br/&gt;Support ticket data is available
     * for 18 months after ticket creation. If a ticket was created more than 18 months ago, a request for data might
     * cause an error.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Communication resources.
     */
    PagedIterable<CommunicationDetails> list(String supportTicketName);

    /**
     * Lists all communications (attachments not included) for a support ticket. &lt;br/&gt;&lt;/br&gt; You can also
     * filter support ticket communications by _CreatedDate_ or _CommunicationType_ using the $filter parameter. The
     * only type of communication supported today is _Web_. Output will be a paged result with _nextLink_, using which
     * you can retrieve the next set of Communication results. &lt;br/&gt;&lt;br/&gt;Support ticket data is available
     * for 18 months after ticket creation. If a ticket was created more than 18 months ago, a request for data might
     * cause an error.
     *
     * @param supportTicketName Support ticket name.
     * @param top The number of values to return in the collection. Default is 10 and max is 10.
     * @param filter The filter to apply on the operation. You can filter by communicationType and createdDate
     *     properties. CommunicationType supports Equals ('eq') operator and createdDate supports Greater Than ('gt')
     *     and Greater Than or Equals ('ge') operators. You may combine the CommunicationType and CreatedDate filters by
     *     Logical And ('and') operator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Communication resources.
     */
    PagedIterable<CommunicationDetails> list(String supportTicketName, Integer top, String filter, Context context);

    /**
     * Returns communication details for a support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param communicationName Communication name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Communication resource.
     */
    CommunicationDetails get(String supportTicketName, String communicationName);

    /**
     * Returns communication details for a support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @param communicationName Communication name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Communication resource.
     */
    Response<CommunicationDetails> getWithResponse(String supportTicketName, String communicationName, Context context);

    /**
     * Returns communication details for a support ticket.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Communication resource.
     */
    CommunicationDetails getById(String id);

    /**
     * Returns communication details for a support ticket.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a Communication resource.
     */
    Response<CommunicationDetails> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CommunicationDetails resource.
     *
     * @param name resource name.
     * @return the first stage of the new CommunicationDetails definition.
     */
    CommunicationDetails.DefinitionStages.Blank define(String name);
}
