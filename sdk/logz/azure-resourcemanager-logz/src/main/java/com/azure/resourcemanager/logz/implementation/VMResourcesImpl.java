// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.resourcemanager.logz.fluent.models.VMResourcesInner;
import com.azure.resourcemanager.logz.models.VMResources;

public final class VMResourcesImpl implements VMResources {
    private VMResourcesInner innerObject;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    VMResourcesImpl(VMResourcesInner innerObject, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String agentVersion() {
        return this.innerModel().agentVersion();
    }

    public VMResourcesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }
}
