// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.training.models.CopyAuthorization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CopyAuthorizationSerializerTest {

    private static final String MODEL_ID = "97bf97bc-3210-4c84-a0ef-9472dec711a0";
    private static final String ACCESS_TOKEN = "769cd41c-9602-4373-ba38-a2531643e041";
    private static final String RESOURCE_ID = "77bf97bc-3210-4c84-a0ef-9462dec712a0";
    private static final String REGION = "westus2";
    private static final long EXPIRES_ON = 1593645622;
    private static final String EXPECTED_JSON_STRING = "{\"modelId\":\"97bf97bc-3210-4c84-a0ef-9472dec711a0\","
        + "\"accessToken\":\"769cd41c-9602-4373-ba38-a2531643e041\","
        + "\"resourceId\":\"77bf97bc-3210-4c84-a0ef-9462dec712a0\",\"resourceRegion\":\"westus2\","
        + "\"expirationDateTimeTicks\":1593645622}";

    /**
     * Test for {@link CopyAuthorization#fromJson(String)}.
     */
    @Test
    public void fromJson() {
        CopyAuthorization copyAuthorization = new CopyAuthorization(MODEL_ID, ACCESS_TOKEN, RESOURCE_ID, REGION,
            EXPIRES_ON);
        String copyAuthorizationString = copyAuthorization.toJson();

        assertTrue(copyAuthorizationString.contains(MODEL_ID));
        assertTrue(copyAuthorizationString.contains(ACCESS_TOKEN));
        assertTrue(copyAuthorizationString.contains(RESOURCE_ID));
        assertTrue(copyAuthorizationString.contains(REGION));

        CopyAuthorization generatedCopyAuthorization = CopyAuthorization.fromJson(copyAuthorizationString);
        assertEquals(copyAuthorization.getModelId(), generatedCopyAuthorization.getModelId());
        assertEquals(copyAuthorization.getAccessToken(), generatedCopyAuthorization.getAccessToken());
        assertEquals(copyAuthorization.getResourceId(), generatedCopyAuthorization.getResourceId());
        assertEquals(copyAuthorization.getResourceRegion(), generatedCopyAuthorization.getResourceRegion());
        assertEquals(copyAuthorization.getExpiresOn(), generatedCopyAuthorization.getExpiresOn());
    }

    /**
     * Test for {@link CopyAuthorization#toJson()}.
     */
    @Test
    public void toJson() {
        CopyAuthorization copyAuthorization = new CopyAuthorization(MODEL_ID, ACCESS_TOKEN, RESOURCE_ID, REGION,
            EXPIRES_ON);
        String copyAuthorizationString = copyAuthorization.toJson();
        assertEquals(EXPECTED_JSON_STRING, copyAuthorizationString);
    }
}
