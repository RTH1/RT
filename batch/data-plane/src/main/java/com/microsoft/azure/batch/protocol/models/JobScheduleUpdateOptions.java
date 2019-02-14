// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for update operation.
 */
public class JobScheduleUpdateOptions {
    /**
     * The maximum time that the server can spend processing the request, in
     * seconds. The default is 30 seconds.
     */
    @JsonProperty(value = "")
    private Integer timeout;

    /**
     * The caller-generated request identity, in the form of a GUID with no
     * decoration such as curly braces, e.g.
     * 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     */
    @JsonProperty(value = "")
    private UUID clientRequestId;

    /**
     * Whether the server should return the client-request-id in the response.
     */
    @JsonProperty(value = "")
    private Boolean returnClientRequestId;

    /**
     * The time the request was issued. Client libraries typically set this to
     * the current system clock time; set it explicitly if you are calling the
     * REST API directly.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ocpDate;

    /**
     * An ETag value associated with the version of the resource known to the
     * client. The operation will be performed only if the resource's current
     * ETag on the service exactly matches the value specified by the client.
     */
    @JsonProperty(value = "")
    private String ifMatch;

    /**
     * An ETag value associated with the version of the resource known to the
     * client. The operation will be performed only if the resource's current
     * ETag on the service does not match the value specified by the client.
     */
    @JsonProperty(value = "")
    private String ifNoneMatch;

    /**
     * A timestamp indicating the last modified time of the resource known to
     * the client. The operation will be performed only if the resource on the
     * service has been modified since the specified time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifModifiedSince;

    /**
     * A timestamp indicating the last modified time of the resource known to
     * the client. The operation will be performed only if the resource on the
     * service has not been modified since the specified time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifUnmodifiedSince;

    /**
     * Get the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.
     *
     * @param timeout the timeout value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the caller-generated request identity, in the form of a GUID with no decoration such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the caller-generated request identity, in the form of a GUID with no decoration such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get whether the server should return the client-request-id in the response.
     *
     * @return the returnClientRequestId value
     */
    public Boolean returnClientRequestId() {
        return this.returnClientRequestId;
    }

    /**
     * Set whether the server should return the client-request-id in the response.
     *
     * @param returnClientRequestId the returnClientRequestId value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withReturnClientRequestId(Boolean returnClientRequestId) {
        this.returnClientRequestId = returnClientRequestId;
        return this;
    }

    /**
     * Get the time the request was issued. Client libraries typically set this to the current system clock time; set it explicitly if you are calling the REST API directly.
     *
     * @return the ocpDate value
     */
    public DateTime ocpDate() {
        if (this.ocpDate == null) {
            return null;
        }
        return this.ocpDate.dateTime();
    }

    /**
     * Set the time the request was issued. Client libraries typically set this to the current system clock time; set it explicitly if you are calling the REST API directly.
     *
     * @param ocpDate the ocpDate value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withOcpDate(DateTime ocpDate) {
        if (ocpDate == null) {
            this.ocpDate = null;
        } else {
            this.ocpDate = new DateTimeRfc1123(ocpDate);
        }
        return this;
    }

    /**
     * Get an ETag value associated with the version of the resource known to the client. The operation will be performed only if the resource's current ETag on the service exactly matches the value specified by the client.
     *
     * @return the ifMatch value
     */
    public String ifMatch() {
        return this.ifMatch;
    }

    /**
     * Set an ETag value associated with the version of the resource known to the client. The operation will be performed only if the resource's current ETag on the service exactly matches the value specified by the client.
     *
     * @param ifMatch the ifMatch value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * Get an ETag value associated with the version of the resource known to the client. The operation will be performed only if the resource's current ETag on the service does not match the value specified by the client.
     *
     * @return the ifNoneMatch value
     */
    public String ifNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * Set an ETag value associated with the version of the resource known to the client. The operation will be performed only if the resource's current ETag on the service does not match the value specified by the client.
     *
     * @param ifNoneMatch the ifNoneMatch value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    /**
     * Get a timestamp indicating the last modified time of the resource known to the client. The operation will be performed only if the resource on the service has been modified since the specified time.
     *
     * @return the ifModifiedSince value
     */
    public DateTime ifModifiedSince() {
        if (this.ifModifiedSince == null) {
            return null;
        }
        return this.ifModifiedSince.dateTime();
    }

    /**
     * Set a timestamp indicating the last modified time of the resource known to the client. The operation will be performed only if the resource on the service has been modified since the specified time.
     *
     * @param ifModifiedSince the ifModifiedSince value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withIfModifiedSince(DateTime ifModifiedSince) {
        if (ifModifiedSince == null) {
            this.ifModifiedSince = null;
        } else {
            this.ifModifiedSince = new DateTimeRfc1123(ifModifiedSince);
        }
        return this;
    }

    /**
     * Get a timestamp indicating the last modified time of the resource known to the client. The operation will be performed only if the resource on the service has not been modified since the specified time.
     *
     * @return the ifUnmodifiedSince value
     */
    public DateTime ifUnmodifiedSince() {
        if (this.ifUnmodifiedSince == null) {
            return null;
        }
        return this.ifUnmodifiedSince.dateTime();
    }

    /**
     * Set a timestamp indicating the last modified time of the resource known to the client. The operation will be performed only if the resource on the service has not been modified since the specified time.
     *
     * @param ifUnmodifiedSince the ifUnmodifiedSince value to set
     * @return the JobScheduleUpdateOptions object itself.
     */
    public JobScheduleUpdateOptions withIfUnmodifiedSince(DateTime ifUnmodifiedSince) {
        if (ifUnmodifiedSince == null) {
            this.ifUnmodifiedSince = null;
        } else {
            this.ifUnmodifiedSince = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return this;
    }

}
