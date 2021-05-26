// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** automaticRepliesSetting. */
@Fluent
public final class MicrosoftGraphAutomaticRepliesSetting {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphAutomaticRepliesSetting.class);

    /*
     * The externalAudience property.
     */
    @JsonProperty(value = "externalAudience")
    private MicrosoftGraphExternalAudienceScope externalAudience;

    /*
     * The automatic reply to send to the specified external audience, if
     * Status is AlwaysEnabled or Scheduled.
     */
    @JsonProperty(value = "externalReplyMessage")
    private String externalReplyMessage;

    /*
     * The automatic reply to send to the audience internal to the signed-in
     * user's organization, if Status is AlwaysEnabled or Scheduled.
     */
    @JsonProperty(value = "internalReplyMessage")
    private String internalReplyMessage;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "scheduledEndDateTime")
    private MicrosoftGraphDateTimeZone scheduledEndDateTime;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "scheduledStartDateTime")
    private MicrosoftGraphDateTimeZone scheduledStartDateTime;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private MicrosoftGraphAutomaticRepliesStatus status;

    /*
     * automaticRepliesSetting
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the externalAudience property: The externalAudience property.
     *
     * @return the externalAudience value.
     */
    public MicrosoftGraphExternalAudienceScope externalAudience() {
        return this.externalAudience;
    }

    /**
     * Set the externalAudience property: The externalAudience property.
     *
     * @param externalAudience the externalAudience value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withExternalAudience(
        MicrosoftGraphExternalAudienceScope externalAudience) {
        this.externalAudience = externalAudience;
        return this;
    }

    /**
     * Get the externalReplyMessage property: The automatic reply to send to the specified external audience, if Status
     * is AlwaysEnabled or Scheduled.
     *
     * @return the externalReplyMessage value.
     */
    public String externalReplyMessage() {
        return this.externalReplyMessage;
    }

    /**
     * Set the externalReplyMessage property: The automatic reply to send to the specified external audience, if Status
     * is AlwaysEnabled or Scheduled.
     *
     * @param externalReplyMessage the externalReplyMessage value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withExternalReplyMessage(String externalReplyMessage) {
        this.externalReplyMessage = externalReplyMessage;
        return this;
    }

    /**
     * Get the internalReplyMessage property: The automatic reply to send to the audience internal to the signed-in
     * user's organization, if Status is AlwaysEnabled or Scheduled.
     *
     * @return the internalReplyMessage value.
     */
    public String internalReplyMessage() {
        return this.internalReplyMessage;
    }

    /**
     * Set the internalReplyMessage property: The automatic reply to send to the audience internal to the signed-in
     * user's organization, if Status is AlwaysEnabled or Scheduled.
     *
     * @param internalReplyMessage the internalReplyMessage value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withInternalReplyMessage(String internalReplyMessage) {
        this.internalReplyMessage = internalReplyMessage;
        return this;
    }

    /**
     * Get the scheduledEndDateTime property: dateTimeTimeZone.
     *
     * @return the scheduledEndDateTime value.
     */
    public MicrosoftGraphDateTimeZone scheduledEndDateTime() {
        return this.scheduledEndDateTime;
    }

    /**
     * Set the scheduledEndDateTime property: dateTimeTimeZone.
     *
     * @param scheduledEndDateTime the scheduledEndDateTime value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withScheduledEndDateTime(
        MicrosoftGraphDateTimeZone scheduledEndDateTime) {
        this.scheduledEndDateTime = scheduledEndDateTime;
        return this;
    }

    /**
     * Get the scheduledStartDateTime property: dateTimeTimeZone.
     *
     * @return the scheduledStartDateTime value.
     */
    public MicrosoftGraphDateTimeZone scheduledStartDateTime() {
        return this.scheduledStartDateTime;
    }

    /**
     * Set the scheduledStartDateTime property: dateTimeTimeZone.
     *
     * @param scheduledStartDateTime the scheduledStartDateTime value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withScheduledStartDateTime(
        MicrosoftGraphDateTimeZone scheduledStartDateTime) {
        this.scheduledStartDateTime = scheduledStartDateTime;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public MicrosoftGraphAutomaticRepliesStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withStatus(MicrosoftGraphAutomaticRepliesStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: automaticRepliesSetting.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: automaticRepliesSetting.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAutomaticRepliesSetting object itself.
     */
    public MicrosoftGraphAutomaticRepliesSetting withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheduledEndDateTime() != null) {
            scheduledEndDateTime().validate();
        }
        if (scheduledStartDateTime() != null) {
            scheduledStartDateTime().validate();
        }
    }
}
