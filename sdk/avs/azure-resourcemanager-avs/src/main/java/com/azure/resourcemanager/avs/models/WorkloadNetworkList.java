// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of workload networks. */
@Immutable
public final class WorkloadNetworkList {
    /*
     * The items on the page
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WorkloadNetworkInner> value;

    /*
     * URL to get the next page if any
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of WorkloadNetworkList class. */
    public WorkloadNetworkList() {
    }

    /**
     * Get the value property: The items on the page.
     *
     * @return the value value.
     */
    public List<WorkloadNetworkInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next page if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}