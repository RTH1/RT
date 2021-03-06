// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobOperationType. */
public final class JobOperationType extends ExpandableStringEnum<JobOperationType> {
    /** Static value Invalid for JobOperationType. */
    public static final JobOperationType INVALID = fromString("Invalid");

    /** Static value Register for JobOperationType. */
    public static final JobOperationType REGISTER = fromString("Register");

    /** Static value UnRegister for JobOperationType. */
    public static final JobOperationType UN_REGISTER = fromString("UnRegister");

    /** Static value ConfigureBackup for JobOperationType. */
    public static final JobOperationType CONFIGURE_BACKUP = fromString("ConfigureBackup");

    /** Static value Backup for JobOperationType. */
    public static final JobOperationType BACKUP = fromString("Backup");

    /** Static value Restore for JobOperationType. */
    public static final JobOperationType RESTORE = fromString("Restore");

    /** Static value DisableBackup for JobOperationType. */
    public static final JobOperationType DISABLE_BACKUP = fromString("DisableBackup");

    /** Static value DeleteBackupData for JobOperationType. */
    public static final JobOperationType DELETE_BACKUP_DATA = fromString("DeleteBackupData");

    /** Static value CrossRegionRestore for JobOperationType. */
    public static final JobOperationType CROSS_REGION_RESTORE = fromString("CrossRegionRestore");

    /** Static value Undelete for JobOperationType. */
    public static final JobOperationType UNDELETE = fromString("Undelete");

    /** Static value UpdateCustomerManagedKey for JobOperationType. */
    public static final JobOperationType UPDATE_CUSTOMER_MANAGED_KEY = fromString("UpdateCustomerManagedKey");

    /**
     * Creates or finds a JobOperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobOperationType.
     */
    @JsonCreator
    public static JobOperationType fromString(String name) {
        return fromString(name, JobOperationType.class);
    }

    /** @return known JobOperationType values. */
    public static Collection<JobOperationType> values() {
        return values(JobOperationType.class);
    }
}
