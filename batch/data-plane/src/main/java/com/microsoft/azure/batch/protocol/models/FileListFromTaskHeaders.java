// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for ListFromTask operation.
 */
public class FileListFromTaskHeaders {
    /**
     * The client-request-id provided by the client during the request. This
     * will be returned only if the return-client-request-id parameter was set
     * to true.
     */
    @JsonProperty(value = "client-request-id")
    private UUID clientRequestId;

    /**
     * A unique identifier for the request that was made to the Batch service.
     * If a request is consistently failing and you have verified that the
     * request is properly formulated, you may use this value to report the
     * error to Microsoft. In your report, include the value of this request
     * ID, the approximate time that the request was made, the Batch account
     * against which the request was made, and the region that account resides
     * in.
     */
    @JsonProperty(value = "request-id")
    private UUID requestId;

    /**
     * The ETag HTTP response header. This is an opaque string. You can use it
     * to detect whether the resource has changed between requests. In
     * particular, you can pass the ETag to one of the If-Modified-Since,
     * If-Unmodified-Since, If-Match or If-None-Match headers.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The time at which the resource was last modified.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * Get the client-request-id provided by the client during the request. This will be returned only if the return-client-request-id parameter was set to true.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the client-request-id provided by the client during the request. This will be returned only if the return-client-request-id parameter was set to true.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the FileListFromTaskHeaders object itself.
     */
    public FileListFromTaskHeaders withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get a unique identifier for the request that was made to the Batch service. If a request is consistently failing and you have verified that the request is properly formulated, you may use this value to report the error to Microsoft. In your report, include the value of this request ID, the approximate time that the request was made, the Batch account against which the request was made, and the region that account resides in.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Set a unique identifier for the request that was made to the Batch service. If a request is consistently failing and you have verified that the request is properly formulated, you may use this value to report the error to Microsoft. In your report, include the value of this request ID, the approximate time that the request was made, the Batch account against which the request was made, and the region that account resides in.
     *
     * @param requestId the requestId value to set
     * @return the FileListFromTaskHeaders object itself.
     */
    public FileListFromTaskHeaders withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the ETag HTTP response header. This is an opaque string. You can use it to detect whether the resource has changed between requests. In particular, you can pass the ETag to one of the If-Modified-Since, If-Unmodified-Since, If-Match or If-None-Match headers.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag HTTP response header. This is an opaque string. You can use it to detect whether the resource has changed between requests. In particular, you can pass the ETag to one of the If-Modified-Since, If-Unmodified-Since, If-Match or If-None-Match headers.
     *
     * @param eTag the eTag value to set
     * @return the FileListFromTaskHeaders object itself.
     */
    public FileListFromTaskHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the time at which the resource was last modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the time at which the resource was last modified.
     *
     * @param lastModified the lastModified value to set
     * @return the FileListFromTaskHeaders object itself.
     */
    public FileListFromTaskHeaders withLastModified(DateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

}
