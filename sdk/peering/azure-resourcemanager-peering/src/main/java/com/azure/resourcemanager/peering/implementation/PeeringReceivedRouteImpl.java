// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.resourcemanager.peering.fluent.models.PeeringReceivedRouteInner;
import com.azure.resourcemanager.peering.models.PeeringReceivedRoute;

public final class PeeringReceivedRouteImpl implements PeeringReceivedRoute {
    private PeeringReceivedRouteInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    PeeringReceivedRouteImpl(
        PeeringReceivedRouteInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String prefix() {
        return this.innerModel().prefix();
    }

    public String nextHop() {
        return this.innerModel().nextHop();
    }

    public String asPath() {
        return this.innerModel().asPath();
    }

    public String originAsValidationState() {
        return this.innerModel().originAsValidationState();
    }

    public String rpkiValidationState() {
        return this.innerModel().rpkiValidationState();
    }

    public String trustAnchor() {
        return this.innerModel().trustAnchor();
    }

    public String receivedTimestamp() {
        return this.innerModel().receivedTimestamp();
    }

    public PeeringReceivedRouteInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }
}
