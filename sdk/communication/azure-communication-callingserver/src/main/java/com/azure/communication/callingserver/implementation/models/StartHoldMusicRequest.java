// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload for playing hold music for a participant. */
@Fluent
public final class StartHoldMusicRequest {
    /*
     * The identifier of the participant.
     */
    @JsonProperty(value = "identifier", required = true)
    private CommunicationIdentifierModel identifier;

    /*
     * The media resource uri of the hold music request.
     * Currently only Wave file (.wav) format audio prompts are supported.
     * More specifically, the audio content in the wave file must be mono
     * (single-channel),
     * 16-bit samples with a 16,000 (16KHz) sampling rate.
     */
    @JsonProperty(value = "audioFileUri")
    private String audioFileUri;

    /*
     * An id for the media in the AudioFileUri, using which we cache the media
     * resource.
     */
    @JsonProperty(value = "audioFileId")
    private String audioFileId;

    /*
     * The callback URI.
     */
    @JsonProperty(value = "callbackUri")
    private String callbackUri;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the identifier property: The identifier of the participant.
     *
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier of the participant.
     *
     * @param identifier the identifier value to set.
     * @return the StartHoldMusicRequest object itself.
     */
    public StartHoldMusicRequest setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the audioFileUri property: The media resource uri of the hold music request. Currently only Wave file (.wav)
     * format audio prompts are supported. More specifically, the audio content in the wave file must be mono
     * (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     *
     * @return the audioFileUri value.
     */
    public String getAudioFileUri() {
        return this.audioFileUri;
    }

    /**
     * Set the audioFileUri property: The media resource uri of the hold music request. Currently only Wave file (.wav)
     * format audio prompts are supported. More specifically, the audio content in the wave file must be mono
     * (single-channel), 16-bit samples with a 16,000 (16KHz) sampling rate.
     *
     * @param audioFileUri the audioFileUri value to set.
     * @return the StartHoldMusicRequest object itself.
     */
    public StartHoldMusicRequest setAudioFileUri(String audioFileUri) {
        this.audioFileUri = audioFileUri;
        return this;
    }

    /**
     * Get the audioFileId property: An id for the media in the AudioFileUri, using which we cache the media resource.
     *
     * @return the audioFileId value.
     */
    public String getAudioFileId() {
        return this.audioFileId;
    }

    /**
     * Set the audioFileId property: An id for the media in the AudioFileUri, using which we cache the media resource.
     *
     * @param audioFileId the audioFileId value to set.
     * @return the StartHoldMusicRequest object itself.
     */
    public StartHoldMusicRequest setAudioFileId(String audioFileId) {
        this.audioFileId = audioFileId;
        return this;
    }

    /**
     * Get the callbackUri property: The callback URI.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback URI.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the StartHoldMusicRequest object itself.
     */
    public StartHoldMusicRequest setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the StartHoldMusicRequest object itself.
     */
    public StartHoldMusicRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}