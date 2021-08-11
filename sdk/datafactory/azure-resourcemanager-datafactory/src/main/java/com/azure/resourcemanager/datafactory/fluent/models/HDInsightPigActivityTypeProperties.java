// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** HDInsight Pig activity properties. */
@Fluent
public final class HDInsightPigActivityTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HDInsightPigActivityTypeProperties.class);

    /*
     * Storage linked service references.
     */
    @JsonProperty(value = "storageLinkedServices")
    private List<LinkedServiceReference> storageLinkedServices;

    /*
     * User specified arguments to HDInsightActivity. Type: array (or
     * Expression with resultType array).
     */
    @JsonProperty(value = "arguments")
    private Object arguments;

    /*
     * Debug info option.
     */
    @JsonProperty(value = "getDebugInfo")
    private HDInsightActivityDebugInfoOption getDebugInfo;

    /*
     * Script path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "scriptPath")
    private Object scriptPath;

    /*
     * Script linked service reference.
     */
    @JsonProperty(value = "scriptLinkedService")
    private LinkedServiceReference scriptLinkedService;

    /*
     * Allows user to specify defines for Pig job request.
     */
    @JsonProperty(value = "defines")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> defines;

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     *
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.storageLinkedServices;
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withStorageLinkedServices(
        List<LinkedServiceReference> storageLinkedServices) {
        this.storageLinkedServices = storageLinkedServices;
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity. Type: array (or Expression with
     * resultType array).
     *
     * @return the arguments value.
     */
    public Object arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity. Type: array (or Expression with
     * resultType array).
     *
     * @param arguments the arguments value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     *
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.getDebugInfo;
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     *
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        this.getDebugInfo = getDebugInfo;
        return this;
    }

    /**
     * Get the scriptPath property: Script path. Type: string (or Expression with resultType string).
     *
     * @return the scriptPath value.
     */
    public Object scriptPath() {
        return this.scriptPath;
    }

    /**
     * Set the scriptPath property: Script path. Type: string (or Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withScriptPath(Object scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * Get the scriptLinkedService property: Script linked service reference.
     *
     * @return the scriptLinkedService value.
     */
    public LinkedServiceReference scriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Set the scriptLinkedService property: Script linked service reference.
     *
     * @param scriptLinkedService the scriptLinkedService value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        this.scriptLinkedService = scriptLinkedService;
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for Pig job request.
     *
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.defines;
    }

    /**
     * Set the defines property: Allows user to specify defines for Pig job request.
     *
     * @param defines the defines value to set.
     * @return the HDInsightPigActivityTypeProperties object itself.
     */
    public HDInsightPigActivityTypeProperties withDefines(Map<String, Object> defines) {
        this.defines = defines;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageLinkedServices() != null) {
            storageLinkedServices().forEach(e -> e.validate());
        }
        if (scriptLinkedService() != null) {
            scriptLinkedService().validate();
        }
    }
}
