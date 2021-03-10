// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.netapp {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.netapp;
    exports com.azure.resourcemanager.netapp.fluent;
    exports com.azure.resourcemanager.netapp.fluent.models;
    exports com.azure.resourcemanager.netapp.models;

    opens com.azure.resourcemanager.netapp.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.netapp.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
