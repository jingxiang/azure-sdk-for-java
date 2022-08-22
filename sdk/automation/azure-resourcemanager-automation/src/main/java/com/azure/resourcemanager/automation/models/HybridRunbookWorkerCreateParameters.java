// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.HybridRunbookWorkerCreateOrUpdateParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters supplied to the create hybrid runbook worker operation. */
@Fluent
public final class HybridRunbookWorkerCreateParameters {
    /*
     * Gets or sets hybrid runbook worker group create or update properties.
     */
    @JsonProperty(value = "properties", required = true)
    private HybridRunbookWorkerCreateOrUpdateParameters innerProperties =
        new HybridRunbookWorkerCreateOrUpdateParameters();

    /*
     * Gets or sets the name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the innerProperties property: Gets or sets hybrid runbook worker group create or update properties.
     *
     * @return the innerProperties value.
     */
    private HybridRunbookWorkerCreateOrUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets or sets the name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the resource.
     *
     * @param name the name value to set.
     * @return the HybridRunbookWorkerCreateParameters object itself.
     */
    public HybridRunbookWorkerCreateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vmResourceId property: Azure Resource Manager Id for a virtual machine.
     *
     * @return the vmResourceId value.
     */
    public String vmResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().vmResourceId();
    }

    /**
     * Set the vmResourceId property: Azure Resource Manager Id for a virtual machine.
     *
     * @param vmResourceId the vmResourceId value to set.
     * @return the HybridRunbookWorkerCreateParameters object itself.
     */
    public HybridRunbookWorkerCreateParameters withVmResourceId(String vmResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HybridRunbookWorkerCreateOrUpdateParameters();
        }
        this.innerProperties().withVmResourceId(vmResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model HybridRunbookWorkerCreateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HybridRunbookWorkerCreateParameters.class);
}