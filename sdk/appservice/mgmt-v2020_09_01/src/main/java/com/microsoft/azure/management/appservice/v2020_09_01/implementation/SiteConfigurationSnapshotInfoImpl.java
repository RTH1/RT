/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.SiteConfigurationSnapshotInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;
import org.joda.time.DateTime;

class SiteConfigurationSnapshotInfoImpl extends WrapperImpl<SiteConfigurationSnapshotInfoInner> implements SiteConfigurationSnapshotInfo {
    private final AppServiceManager manager;
    SiteConfigurationSnapshotInfoImpl(SiteConfigurationSnapshotInfoInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer snapshotId() {
        return this.inner().snapshotId();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public DateTime time() {
        return this.inner().time();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
