// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityContactInner;

/** An immutable client-side representation of SecurityContact. */
public interface SecurityContact {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the email property: The email of this security contact.
     *
     * @return the email value.
     */
    String email();

    /**
     * Gets the phone property: The phone number of this security contact.
     *
     * @return the phone value.
     */
    String phone();

    /**
     * Gets the alertNotifications property: Whether to send security alerts notifications to the security contact.
     *
     * @return the alertNotifications value.
     */
    AlertNotifications alertNotifications();

    /**
     * Gets the alertsToAdmins property: Whether to send security alerts notifications to subscription admins.
     *
     * @return the alertsToAdmins value.
     */
    AlertsToAdmins alertsToAdmins();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.SecurityContactInner object.
     *
     * @return the inner object.
     */
    SecurityContactInner innerModel();

    /** The entirety of the SecurityContact definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The SecurityContact definition stages. */
    interface DefinitionStages {
        /** The first stage of the SecurityContact definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the SecurityContact definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithEmail,
                DefinitionStages.WithPhone,
                DefinitionStages.WithAlertNotifications,
                DefinitionStages.WithAlertsToAdmins {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SecurityContact create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SecurityContact create(Context context);
        }
        /** The stage of the SecurityContact definition allowing to specify email. */
        interface WithEmail {
            /**
             * Specifies the email property: The email of this security contact.
             *
             * @param email The email of this security contact.
             * @return the next definition stage.
             */
            WithCreate withEmail(String email);
        }
        /** The stage of the SecurityContact definition allowing to specify phone. */
        interface WithPhone {
            /**
             * Specifies the phone property: The phone number of this security contact.
             *
             * @param phone The phone number of this security contact.
             * @return the next definition stage.
             */
            WithCreate withPhone(String phone);
        }
        /** The stage of the SecurityContact definition allowing to specify alertNotifications. */
        interface WithAlertNotifications {
            /**
             * Specifies the alertNotifications property: Whether to send security alerts notifications to the security
             * contact.
             *
             * @param alertNotifications Whether to send security alerts notifications to the security contact.
             * @return the next definition stage.
             */
            WithCreate withAlertNotifications(AlertNotifications alertNotifications);
        }
        /** The stage of the SecurityContact definition allowing to specify alertsToAdmins. */
        interface WithAlertsToAdmins {
            /**
             * Specifies the alertsToAdmins property: Whether to send security alerts notifications to subscription
             * admins.
             *
             * @param alertsToAdmins Whether to send security alerts notifications to subscription admins.
             * @return the next definition stage.
             */
            WithCreate withAlertsToAdmins(AlertsToAdmins alertsToAdmins);
        }
    }
    /**
     * Begins update for the SecurityContact resource.
     *
     * @return the stage of resource update.
     */
    SecurityContact.Update update();

    /** The template for SecurityContact update. */
    interface Update
        extends UpdateStages.WithEmail,
            UpdateStages.WithPhone,
            UpdateStages.WithAlertNotifications,
            UpdateStages.WithAlertsToAdmins {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SecurityContact apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SecurityContact apply(Context context);
    }
    /** The SecurityContact update stages. */
    interface UpdateStages {
        /** The stage of the SecurityContact update allowing to specify email. */
        interface WithEmail {
            /**
             * Specifies the email property: The email of this security contact.
             *
             * @param email The email of this security contact.
             * @return the next definition stage.
             */
            Update withEmail(String email);
        }
        /** The stage of the SecurityContact update allowing to specify phone. */
        interface WithPhone {
            /**
             * Specifies the phone property: The phone number of this security contact.
             *
             * @param phone The phone number of this security contact.
             * @return the next definition stage.
             */
            Update withPhone(String phone);
        }
        /** The stage of the SecurityContact update allowing to specify alertNotifications. */
        interface WithAlertNotifications {
            /**
             * Specifies the alertNotifications property: Whether to send security alerts notifications to the security
             * contact.
             *
             * @param alertNotifications Whether to send security alerts notifications to the security contact.
             * @return the next definition stage.
             */
            Update withAlertNotifications(AlertNotifications alertNotifications);
        }
        /** The stage of the SecurityContact update allowing to specify alertsToAdmins. */
        interface WithAlertsToAdmins {
            /**
             * Specifies the alertsToAdmins property: Whether to send security alerts notifications to subscription
             * admins.
             *
             * @param alertsToAdmins Whether to send security alerts notifications to subscription admins.
             * @return the next definition stage.
             */
            Update withAlertsToAdmins(AlertsToAdmins alertsToAdmins);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SecurityContact refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SecurityContact refresh(Context context);
}
