// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Profile of the managed cluster NAT gateway. */
@Fluent
public final class ManagedClusterNatGatewayProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterNatGatewayProfile.class);

    /*
     * Profile of the managed outbound IP resources of the cluster NAT gateway.
     */
    @JsonProperty(value = "managedOutboundIPProfile")
    private ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile;

    /*
     * The effective outbound IP resources of the cluster NAT gateway.
     */
    @JsonProperty(value = "effectiveOutboundIPs")
    private List<ResourceReference> effectiveOutboundIPs;

    /*
     * Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 4 minutes.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Get the managedOutboundIpProfile property: Profile of the managed outbound IP resources of the cluster NAT
     * gateway.
     *
     * @return the managedOutboundIpProfile value.
     */
    public ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile() {
        return this.managedOutboundIpProfile;
    }

    /**
     * Set the managedOutboundIpProfile property: Profile of the managed outbound IP resources of the cluster NAT
     * gateway.
     *
     * @param managedOutboundIpProfile the managedOutboundIpProfile value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile withManagedOutboundIpProfile(
        ManagedClusterManagedOutboundIpProfile managedOutboundIpProfile) {
        this.managedOutboundIpProfile = managedOutboundIpProfile;
        return this;
    }

    /**
     * Get the effectiveOutboundIPs property: The effective outbound IP resources of the cluster NAT gateway.
     *
     * @return the effectiveOutboundIPs value.
     */
    public List<ResourceReference> effectiveOutboundIPs() {
        return this.effectiveOutboundIPs;
    }

    /**
     * Set the effectiveOutboundIPs property: The effective outbound IP resources of the cluster NAT gateway.
     *
     * @param effectiveOutboundIPs the effectiveOutboundIPs value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile withEffectiveOutboundIPs(List<ResourceReference> effectiveOutboundIPs) {
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 4 minutes.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 4 minutes.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the ManagedClusterNatGatewayProfile object itself.
     */
    public ManagedClusterNatGatewayProfile withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedOutboundIpProfile() != null) {
            managedOutboundIpProfile().validate();
        }
        if (effectiveOutboundIPs() != null) {
            effectiveOutboundIPs().forEach(e -> e.validate());
        }
    }
}
