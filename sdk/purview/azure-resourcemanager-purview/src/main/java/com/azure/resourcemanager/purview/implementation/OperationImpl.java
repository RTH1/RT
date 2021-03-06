// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.implementation;

import com.azure.resourcemanager.purview.fluent.models.OperationInner;
import com.azure.resourcemanager.purview.models.Operation;
import com.azure.resourcemanager.purview.models.OperationDisplay;
import com.azure.resourcemanager.purview.models.OperationMetaServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.purview.PurviewManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.purview.PurviewManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationMetaServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.purview.PurviewManager manager() {
        return this.serviceManager;
    }
}
