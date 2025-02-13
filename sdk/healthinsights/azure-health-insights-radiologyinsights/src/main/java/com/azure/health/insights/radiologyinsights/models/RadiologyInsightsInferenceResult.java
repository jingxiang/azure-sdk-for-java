// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The inference results for the Radiology Insights request. If field 'status' has value 'succeeded', then field
 * 'result' will contain an instance of RadiologyInsightsInferenceResult.
 */
@Immutable
public final class RadiologyInsightsInferenceResult {

    /*
     * Results for the patients given in the request.
     */
    @Generated
    @JsonProperty(value = "patientResults")
    private List<RadiologyInsightsPatientResult> patientResults;

    /*
     * The version of the model used for inference, expressed as the model date.
     */
    @Generated
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /**
     * Creates an instance of RadiologyInsightsInferenceResult class.
     *
     * @param patientResults the patientResults value to set.
     * @param modelVersion the modelVersion value to set.
     */
    @Generated
    @JsonCreator
    private RadiologyInsightsInferenceResult(
        @JsonProperty(value = "patientResults") List<RadiologyInsightsPatientResult> patientResults,
        @JsonProperty(value = "modelVersion") String modelVersion) {
        this.patientResults = patientResults;
        this.modelVersion = modelVersion;
    }

    /**
     * Get the patientResults property: Results for the patients given in the request.
     *
     * @return the patientResults value.
     */
    @Generated
    public List<RadiologyInsightsPatientResult> getPatientResults() {
        return this.patientResults;
    }

    /**
     * Get the modelVersion property: The version of the model used for inference, expressed as the model date.
     *
     * @return the modelVersion value.
     */
    @Generated
    public String getModelVersion() {
        return this.modelVersion;
    }
}
