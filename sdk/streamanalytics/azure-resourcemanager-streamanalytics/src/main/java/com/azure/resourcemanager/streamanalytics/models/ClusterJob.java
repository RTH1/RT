// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterJobInner;

/** An immutable client-side representation of ClusterJob. */
public interface ClusterJob {
    /**
     * Gets the id property: Resource ID of the streaming job.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the streamingUnits property: The number of streaming units that are used by the streaming job.
     *
     * @return the streamingUnits value.
     */
    Integer streamingUnits();

    /**
     * Gets the jobState property: The current execution state of the streaming job.
     *
     * @return the jobState value.
     */
    JobState jobState();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.ClusterJobInner object.
     *
     * @return the inner object.
     */
    ClusterJobInner innerModel();
}
