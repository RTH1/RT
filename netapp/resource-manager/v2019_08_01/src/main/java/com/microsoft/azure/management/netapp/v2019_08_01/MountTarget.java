/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2019_08_01.implementation.MountTargetInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2019_08_01.implementation.NetAppManager;
import java.util.Map;

/**
 * Type representing MountTarget.
 */
public interface MountTarget extends HasInner<MountTargetInner>, HasManager<NetAppManager> {
    /**
     * @return the endIp value.
     */
    String endIp();

    /**
     * @return the fileSystemId value.
     */
    String fileSystemId();

    /**
     * @return the gateway value.
     */
    String gateway();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the mountTargetId value.
     */
    String mountTargetId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the netmask value.
     */
    String netmask();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the smbServerFqdn value.
     */
    String smbServerFqdn();

    /**
     * @return the startIp value.
     */
    String startIp();

    /**
     * @return the subnet value.
     */
    String subnet();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
