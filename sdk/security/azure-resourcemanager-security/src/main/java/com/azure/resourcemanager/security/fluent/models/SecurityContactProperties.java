// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.SecurityContactPropertiesAlertNotifications;
import com.azure.resourcemanager.security.models.SecurityContactPropertiesNotificationsByRole;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes security contact properties. */
@Fluent
public final class SecurityContactProperties {
    /*
     * List of email addresses which will get notifications from Microsoft Defender for Cloud by the configurations
     * defined in this security contact.
     */
    @JsonProperty(value = "emails")
    private String emails;

    /*
     * The security contact's phone number
     */
    @JsonProperty(value = "phone")
    private String phone;

    /*
     * Defines whether to send email notifications about new security alerts
     */
    @JsonProperty(value = "alertNotifications")
    private SecurityContactPropertiesAlertNotifications alertNotifications;

    /*
     * Defines whether to send email notifications from Microsoft Defender for Cloud to persons with specific RBAC
     * roles on the subscription.
     */
    @JsonProperty(value = "notificationsByRole")
    private SecurityContactPropertiesNotificationsByRole notificationsByRole;

    /**
     * Get the emails property: List of email addresses which will get notifications from Microsoft Defender for Cloud
     * by the configurations defined in this security contact.
     *
     * @return the emails value.
     */
    public String emails() {
        return this.emails;
    }

    /**
     * Set the emails property: List of email addresses which will get notifications from Microsoft Defender for Cloud
     * by the configurations defined in this security contact.
     *
     * @param emails the emails value to set.
     * @return the SecurityContactProperties object itself.
     */
    public SecurityContactProperties withEmails(String emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the phone property: The security contact's phone number.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: The security contact's phone number.
     *
     * @param phone the phone value to set.
     * @return the SecurityContactProperties object itself.
     */
    public SecurityContactProperties withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the alertNotifications property: Defines whether to send email notifications about new security alerts.
     *
     * @return the alertNotifications value.
     */
    public SecurityContactPropertiesAlertNotifications alertNotifications() {
        return this.alertNotifications;
    }

    /**
     * Set the alertNotifications property: Defines whether to send email notifications about new security alerts.
     *
     * @param alertNotifications the alertNotifications value to set.
     * @return the SecurityContactProperties object itself.
     */
    public SecurityContactProperties withAlertNotifications(
        SecurityContactPropertiesAlertNotifications alertNotifications) {
        this.alertNotifications = alertNotifications;
        return this;
    }

    /**
     * Get the notificationsByRole property: Defines whether to send email notifications from Microsoft Defender for
     * Cloud to persons with specific RBAC roles on the subscription.
     *
     * @return the notificationsByRole value.
     */
    public SecurityContactPropertiesNotificationsByRole notificationsByRole() {
        return this.notificationsByRole;
    }

    /**
     * Set the notificationsByRole property: Defines whether to send email notifications from Microsoft Defender for
     * Cloud to persons with specific RBAC roles on the subscription.
     *
     * @param notificationsByRole the notificationsByRole value to set.
     * @return the SecurityContactProperties object itself.
     */
    public SecurityContactProperties withNotificationsByRole(
        SecurityContactPropertiesNotificationsByRole notificationsByRole) {
        this.notificationsByRole = notificationsByRole;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alertNotifications() != null) {
            alertNotifications().validate();
        }
        if (notificationsByRole() != null) {
            notificationsByRole().validate();
        }
    }
}