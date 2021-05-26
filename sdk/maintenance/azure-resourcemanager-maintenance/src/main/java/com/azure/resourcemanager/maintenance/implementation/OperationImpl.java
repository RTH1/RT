// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.resourcemanager.maintenance.fluent.models.OperationInner;
import com.azure.resourcemanager.maintenance.models.Operation;
import com.azure.resourcemanager.maintenance.models.OperationInfo;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationInfo display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }
}
