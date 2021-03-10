/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger based on status code.
 */
public class StatusCodesBasedTrigger {
    /**
     * HTTP status code.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /**
     * Request Sub Status.
     */
    @JsonProperty(value = "subStatus")
    private Integer subStatus;

    /**
     * Win32 error code.
     */
    @JsonProperty(value = "win32Status")
    private Integer win32Status;

    /**
     * Request Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Get hTTP status code.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set hTTP status code.
     *
     * @param status the status value to set
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get request Sub Status.
     *
     * @return the subStatus value
     */
    public Integer subStatus() {
        return this.subStatus;
    }

    /**
     * Set request Sub Status.
     *
     * @param subStatus the subStatus value to set
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withSubStatus(Integer subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * Get win32 error code.
     *
     * @return the win32Status value
     */
    public Integer win32Status() {
        return this.win32Status;
    }

    /**
     * Set win32 error code.
     *
     * @param win32Status the win32Status value to set
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withWin32Status(Integer win32Status) {
        this.win32Status = win32Status;
        return this;
    }

    /**
     * Get request Count.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set request Count.
     *
     * @param count the count value to set
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get time interval.
     *
     * @return the timeInterval value
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set time interval.
     *
     * @param timeInterval the timeInterval value to set
     * @return the StatusCodesBasedTrigger object itself.
     */
    public StatusCodesBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

}
