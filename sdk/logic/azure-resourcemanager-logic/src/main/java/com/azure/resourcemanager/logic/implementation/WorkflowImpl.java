// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;
import com.azure.resourcemanager.logic.models.FlowAccessControlConfiguration;
import com.azure.resourcemanager.logic.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.logic.models.GenerateUpgradedDefinitionParameters;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.RegenerateActionParameter;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.Sku;
import com.azure.resourcemanager.logic.models.Workflow;
import com.azure.resourcemanager.logic.models.WorkflowParameter;
import com.azure.resourcemanager.logic.models.WorkflowProvisioningState;
import com.azure.resourcemanager.logic.models.WorkflowReference;
import com.azure.resourcemanager.logic.models.WorkflowState;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class WorkflowImpl implements Workflow, Workflow.Definition, Workflow.Update {
    private WorkflowInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WorkflowProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public OffsetDateTime changedTime() {
        return this.innerModel().changedTime();
    }

    public WorkflowState state() {
        return this.innerModel().state();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String accessEndpoint() {
        return this.innerModel().accessEndpoint();
    }

    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.innerModel().endpointsConfiguration();
    }

    public FlowAccessControlConfiguration accessControl() {
        return this.innerModel().accessControl();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public ResourceReference integrationAccount() {
        return this.innerModel().integrationAccount();
    }

    public ResourceReference integrationServiceEnvironment() {
        return this.innerModel().integrationServiceEnvironment();
    }

    public Object definition() {
        return this.innerModel().definition();
    }

    public Map<String, WorkflowParameter> parameters() {
        Map<String, WorkflowParameter> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WorkflowInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workflowName;

    public WorkflowImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workflow create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .createOrUpdateWithResponse(resourceGroupName, workflowName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Workflow create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .createOrUpdateWithResponse(resourceGroupName, workflowName, this.innerModel(), context)
                .getValue();
        return this;
    }

    WorkflowImpl(String name, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = new WorkflowInner();
        this.serviceManager = serviceManager;
        this.workflowName = name;
    }

    public WorkflowImpl update() {
        return this;
    }

    public Workflow apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .createOrUpdateWithResponse(resourceGroupName, workflowName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Workflow apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .createOrUpdateWithResponse(resourceGroupName, workflowName, this.innerModel(), context)
                .getValue();
        return this;
    }

    WorkflowImpl(WorkflowInner innerObject, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workflowName = Utils.getValueFromIdByName(innerObject.id(), "workflows");
    }

    public Workflow refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .getByResourceGroupWithResponse(resourceGroupName, workflowName, Context.NONE)
                .getValue();
        return this;
    }

    public Workflow refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkflows()
                .getByResourceGroupWithResponse(resourceGroupName, workflowName, context)
                .getValue();
        return this;
    }

    public void disable() {
        serviceManager.workflows().disable(resourceGroupName, workflowName);
    }

    public Response<Void> disableWithResponse(Context context) {
        return serviceManager.workflows().disableWithResponse(resourceGroupName, workflowName, context);
    }

    public void enable() {
        serviceManager.workflows().enable(resourceGroupName, workflowName);
    }

    public Response<Void> enableWithResponse(Context context) {
        return serviceManager.workflows().enableWithResponse(resourceGroupName, workflowName, context);
    }

    public Object generateUpgradedDefinition(GenerateUpgradedDefinitionParameters parameters) {
        return serviceManager.workflows().generateUpgradedDefinition(resourceGroupName, workflowName, parameters);
    }

    public Response<Object> generateUpgradedDefinitionWithResponse(
        GenerateUpgradedDefinitionParameters parameters, Context context) {
        return serviceManager
            .workflows()
            .generateUpgradedDefinitionWithResponse(resourceGroupName, workflowName, parameters, context);
    }

    public WorkflowTriggerCallbackUrl listCallbackUrl(GetCallbackUrlParameters listCallbackUrl) {
        return serviceManager.workflows().listCallbackUrl(resourceGroupName, workflowName, listCallbackUrl);
    }

    public Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(
        GetCallbackUrlParameters listCallbackUrl, Context context) {
        return serviceManager
            .workflows()
            .listCallbackUrlWithResponse(resourceGroupName, workflowName, listCallbackUrl, context);
    }

    public Object listSwagger() {
        return serviceManager.workflows().listSwagger(resourceGroupName, workflowName);
    }

    public Response<Object> listSwaggerWithResponse(Context context) {
        return serviceManager.workflows().listSwaggerWithResponse(resourceGroupName, workflowName, context);
    }

    public void move(WorkflowReference move) {
        serviceManager.workflows().move(resourceGroupName, workflowName, move);
    }

    public void move(WorkflowReference move, Context context) {
        serviceManager.workflows().move(resourceGroupName, workflowName, move, context);
    }

    public void regenerateAccessKey(RegenerateActionParameter keyType) {
        serviceManager.workflows().regenerateAccessKey(resourceGroupName, workflowName, keyType);
    }

    public Response<Void> regenerateAccessKeyWithResponse(RegenerateActionParameter keyType, Context context) {
        return serviceManager
            .workflows()
            .regenerateAccessKeyWithResponse(resourceGroupName, workflowName, keyType, context);
    }

    public void validateByResourceGroup(WorkflowInner validate) {
        serviceManager.workflows().validateByResourceGroup(resourceGroupName, workflowName, validate);
    }

    public Response<Void> validateByResourceGroupWithResponse(WorkflowInner validate, Context context) {
        return serviceManager
            .workflows()
            .validateByResourceGroupWithResponse(resourceGroupName, workflowName, validate, context);
    }

    public WorkflowImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkflowImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkflowImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public WorkflowImpl withState(WorkflowState state) {
        this.innerModel().withState(state);
        return this;
    }

    public WorkflowImpl withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        this.innerModel().withEndpointsConfiguration(endpointsConfiguration);
        return this;
    }

    public WorkflowImpl withAccessControl(FlowAccessControlConfiguration accessControl) {
        this.innerModel().withAccessControl(accessControl);
        return this;
    }

    public WorkflowImpl withIntegrationAccount(ResourceReference integrationAccount) {
        this.innerModel().withIntegrationAccount(integrationAccount);
        return this;
    }

    public WorkflowImpl withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment) {
        this.innerModel().withIntegrationServiceEnvironment(integrationServiceEnvironment);
        return this;
    }

    public WorkflowImpl withDefinition(Object definition) {
        this.innerModel().withDefinition(definition);
        return this;
    }

    public WorkflowImpl withParameters(Map<String, WorkflowParameter> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }
}
