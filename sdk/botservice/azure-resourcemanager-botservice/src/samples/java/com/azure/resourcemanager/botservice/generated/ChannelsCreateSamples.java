// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.resourcemanager.botservice.models.AlexaChannel;
import com.azure.resourcemanager.botservice.models.AlexaChannelProperties;
import com.azure.resourcemanager.botservice.models.ChannelName;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannel;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannelProperties;
import com.azure.resourcemanager.botservice.models.EmailChannel;
import com.azure.resourcemanager.botservice.models.EmailChannelProperties;
import com.azure.resourcemanager.botservice.models.LineChannel;
import com.azure.resourcemanager.botservice.models.LineChannelProperties;
import com.azure.resourcemanager.botservice.models.LineRegistration;
import java.util.Arrays;

/** Samples for Channels Create. */
public final class ChannelsCreateSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/PutDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Create DirectLine Speech Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void createDirectLineSpeechBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager
            .channels()
            .define(ChannelName.DIRECT_LINE_SPEECH_CHANNEL)
            .withRegion("global")
            .withExistingBotService("OneResourceGroupName", "samplebotname")
            .withProperties(
                new DirectLineSpeechChannel()
                    .withProperties(
                        new DirectLineSpeechChannelProperties()
                            .withCognitiveServiceRegion("XcognitiveServiceRegionX")
                            .withCognitiveServiceSubscriptionKey("XcognitiveServiceSubscriptionKeyX")
                            .withIsEnabled(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/PutChannel.json
     */
    /**
     * Sample code: Create Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void createBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager
            .channels()
            .define(ChannelName.EMAIL_CHANNEL)
            .withRegion("global")
            .withExistingBotService("OneResourceGroupName", "samplebotname")
            .withProperties(
                new EmailChannel()
                    .withProperties(
                        new EmailChannelProperties()
                            .withEmailAddress("a@b.com")
                            .withPassword("pwd")
                            .withIsEnabled(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/PutAlexaChannel.json
     */
    /**
     * Sample code: Create Alexa Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void createAlexaBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager
            .channels()
            .define(ChannelName.ALEXA_CHANNEL)
            .withRegion("global")
            .withExistingBotService("OneResourceGroupName", "samplebotname")
            .withProperties(
                new AlexaChannel()
                    .withProperties(
                        new AlexaChannelProperties().withAlexaSkillId("XAlexaSkillIdX").withIsEnabled(true)))
            .create();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/PutLineChannel.json
     */
    /**
     * Sample code: Create Line Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void createLineBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager
            .channels()
            .define(ChannelName.LINE_CHANNEL)
            .withRegion("global")
            .withExistingBotService("OneResourceGroupName", "samplebotname")
            .withProperties(
                new LineChannel()
                    .withProperties(
                        new LineChannelProperties()
                            .withLineRegistrations(
                                Arrays
                                    .asList(
                                        new LineRegistration()
                                            .withChannelSecret("channelSecret")
                                            .withChannelAccessToken("channelAccessToken")))))
            .create();
    }
}
