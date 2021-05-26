// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphTeamSpecialization. */
public final class MicrosoftGraphTeamSpecialization extends ExpandableStringEnum<MicrosoftGraphTeamSpecialization> {
    /** Static value none for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization NONE = fromString("none");

    /** Static value educationStandard for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization EDUCATION_STANDARD = fromString("educationStandard");

    /** Static value educationClass for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization EDUCATION_CLASS = fromString("educationClass");

    /** Static value educationProfessionalLearningCommunity for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization EDUCATION_PROFESSIONAL_LEARNING_COMMUNITY =
        fromString("educationProfessionalLearningCommunity");

    /** Static value educationStaff for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization EDUCATION_STAFF = fromString("educationStaff");

    /** Static value healthcareStandard for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization HEALTHCARE_STANDARD = fromString("healthcareStandard");

    /** Static value healthcareCareCoordination for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization HEALTHCARE_CARE_COORDINATION =
        fromString("healthcareCareCoordination");

    /** Static value unknownFutureValue for MicrosoftGraphTeamSpecialization. */
    public static final MicrosoftGraphTeamSpecialization UNKNOWN_FUTURE_VALUE = fromString("unknownFutureValue");

    /**
     * Creates or finds a MicrosoftGraphTeamSpecialization from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphTeamSpecialization.
     */
    @JsonCreator
    public static MicrosoftGraphTeamSpecialization fromString(String name) {
        return fromString(name, MicrosoftGraphTeamSpecialization.class);
    }

    /** @return known MicrosoftGraphTeamSpecialization values. */
    public static Collection<MicrosoftGraphTeamSpecialization> values() {
        return values(MicrosoftGraphTeamSpecialization.class);
    }
}
