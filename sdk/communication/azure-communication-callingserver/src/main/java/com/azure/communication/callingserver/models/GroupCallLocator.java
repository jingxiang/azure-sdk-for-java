// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.annotation.Immutable;

/** The locator used for joining or taking action on a call. */
@Immutable
public final class GroupCallLocator extends CallLocator {
    /*
     * The group call id
     */
    private final String groupCallId;

    /**
     * Group call locator
     *
     * @param groupCallId Specify the group call id.
     */
    public GroupCallLocator(String groupCallId) {
        super(CallLocatorKind.GROUP_CALL_LOCATOR);
        this.groupCallId = groupCallId;
    }

    /**
     * Get the groupCallId property: The group call id.
     *
     * @return the groupCallId value.
     */
    public String getGroupCallId() {
        return this.groupCallId;
    }
}