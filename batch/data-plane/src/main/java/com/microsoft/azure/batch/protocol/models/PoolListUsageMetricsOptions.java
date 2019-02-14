// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for listUsageMetrics operation.
 */
public class PoolListUsageMetricsOptions {
    /**
     * The earliest time from which to include metrics. This must be at least
     * two and a half hours before the current time. If not specified this
     * defaults to the start time of the last aggregation interval currently
     * available.
     */
    @JsonProperty(value = "")
    private DateTime startTime;

    /**
     * The latest time from which to include metrics. This must be at least two
     * hours before the current time. If not specified this defaults to the end
     * time of the last aggregation interval currently available.
     */
    @JsonProperty(value = "")
    private DateTime endTime;

    /**
     * An OData $filter clause. For more information on constructing this
     * filter, see
     * https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-account-usage-metrics.
     */
    @JsonProperty(value = "")
    private String filter;

    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * results will be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

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
     * Get the earliest time from which to include metrics. This must be at least two and a half hours before the current time. If not specified this defaults to the start time of the last aggregation interval currently available.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the earliest time from which to include metrics. This must be at least two and a half hours before the current time. If not specified this defaults to the start time of the last aggregation interval currently available.
     *
     * @param startTime the startTime value to set
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the latest time from which to include metrics. This must be at least two hours before the current time. If not specified this defaults to the end time of the last aggregation interval currently available.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the latest time from which to include metrics. This must be at least two hours before the current time. If not specified this defaults to the end time of the last aggregation interval currently available.
     *
     * @param endTime the endTime value to set
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get an OData $filter clause. For more information on constructing this filter, see https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-account-usage-metrics.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set an OData $filter clause. For more information on constructing this filter, see https://docs.microsoft.com/en-us/rest/api/batchservice/odata-filters-in-batch#list-account-usage-metrics.
     *
     * @param filter the filter value to set
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the maximum number of items to return in the response. A maximum of 1000 results will be returned.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maximum number of items to return in the response. A maximum of 1000 results will be returned.
     *
     * @param maxResults the maxResults value to set
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

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
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withTimeout(Integer timeout) {
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
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withClientRequestId(UUID clientRequestId) {
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
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withReturnClientRequestId(Boolean returnClientRequestId) {
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
     * @return the PoolListUsageMetricsOptions object itself.
     */
    public PoolListUsageMetricsOptions withOcpDate(DateTime ocpDate) {
        if (ocpDate == null) {
            this.ocpDate = null;
        } else {
            this.ocpDate = new DateTimeRfc1123(ocpDate);
        }
        return this;
    }

}
