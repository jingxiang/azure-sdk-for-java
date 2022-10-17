// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtestservice.fluent.models.QuotaBucketRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request object of new quota for a quota bucket. */
@Fluent
public final class QuotaBucketRequest extends ProxyResource {
    /*
     * New quota request request properties.
     */
    @JsonProperty(value = "properties")
    private QuotaBucketRequestProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of QuotaBucketRequest class. */
    public QuotaBucketRequest() {
    }

    /**
     * Get the innerProperties property: New quota request request properties.
     *
     * @return the innerProperties value.
     */
    private QuotaBucketRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the currentUsage property: Current quota usage of the quota bucket.
     *
     * @return the currentUsage value.
     */
    public Integer currentUsage() {
        return this.innerProperties() == null ? null : this.innerProperties().currentUsage();
    }

    /**
     * Set the currentUsage property: Current quota usage of the quota bucket.
     *
     * @param currentUsage the currentUsage value to set.
     * @return the QuotaBucketRequest object itself.
     */
    public QuotaBucketRequest withCurrentUsage(Integer currentUsage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaBucketRequestProperties();
        }
        this.innerProperties().withCurrentUsage(currentUsage);
        return this;
    }

    /**
     * Get the currentQuota property: Current quota limit of the quota bucket.
     *
     * @return the currentQuota value.
     */
    public Integer currentQuota() {
        return this.innerProperties() == null ? null : this.innerProperties().currentQuota();
    }

    /**
     * Set the currentQuota property: Current quota limit of the quota bucket.
     *
     * @param currentQuota the currentQuota value to set.
     * @return the QuotaBucketRequest object itself.
     */
    public QuotaBucketRequest withCurrentQuota(Integer currentQuota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaBucketRequestProperties();
        }
        this.innerProperties().withCurrentQuota(currentQuota);
        return this;
    }

    /**
     * Get the newQuota property: New quota limit of the quota bucket.
     *
     * @return the newQuota value.
     */
    public Integer newQuota() {
        return this.innerProperties() == null ? null : this.innerProperties().newQuota();
    }

    /**
     * Set the newQuota property: New quota limit of the quota bucket.
     *
     * @param newQuota the newQuota value to set.
     * @return the QuotaBucketRequest object itself.
     */
    public QuotaBucketRequest withNewQuota(Integer newQuota) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaBucketRequestProperties();
        }
        this.innerProperties().withNewQuota(newQuota);
        return this;
    }

    /**
     * Get the dimensions property: Dimensions for new quota request.
     *
     * @return the dimensions value.
     */
    public QuotaBucketRequestPropertiesDimensions dimensions() {
        return this.innerProperties() == null ? null : this.innerProperties().dimensions();
    }

    /**
     * Set the dimensions property: Dimensions for new quota request.
     *
     * @param dimensions the dimensions value to set.
     * @return the QuotaBucketRequest object itself.
     */
    public QuotaBucketRequest withDimensions(QuotaBucketRequestPropertiesDimensions dimensions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaBucketRequestProperties();
        }
        this.innerProperties().withDimensions(dimensions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}