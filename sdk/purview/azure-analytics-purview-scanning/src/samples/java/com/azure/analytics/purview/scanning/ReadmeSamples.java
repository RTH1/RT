// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.analytics.purview.scanning;

import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 * WARNING: MODIFYING THIS FILE WILL REQUIRE CORRESPONDING UPDATES TO README.md FILE. LINE NUMBERS
 * ARE USED TO EXTRACT APPROPRIATE CODE SEGMENTS FROM THIS FILE. ADD NEW CODE AT THE BOTTOM TO AVOID CHANGING
 * LINE NUMBERS OF EXISTING CODE SAMPLES.
 *
 * Code samples for the README.md
 */
public class ReadmeSamples {
    /**
     * Sample for creating low level client.
     */
    public void createClient() {
        SystemScanRulesetsClient client = new PurviewScanningClientBuilder()
            .endpoint("<account-name>.scan.purview.azure.com")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildSystemScanRulesetsClient();
    }
}
