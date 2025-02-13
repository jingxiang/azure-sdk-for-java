// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Finding options.
 */
@Fluent
public final class FindingOptions {

    /*
     * If this is true, provide the sentence that contains the first token of the finding's clinical indicator (i.e.
     * the medical problem), if there is one. This sentence is provided as an extension with url 'ci_sentence', next to
     * the token evidence. Default is false.
     */
    @Generated
    @JsonProperty(value = "provideFocusedSentenceEvidence")
    private Boolean provideFocusedSentenceEvidence;

    /**
     * Creates an instance of FindingOptions class.
     */
    @Generated
    public FindingOptions() {
    }

    /**
     * Get the provideFocusedSentenceEvidence property: If this is true, provide the sentence that contains the first
     * token of the finding's clinical indicator (i.e. the medical problem), if there is one. This sentence is provided
     * as an extension with url 'ci_sentence', next to the token evidence. Default is false.
     *
     * @return the provideFocusedSentenceEvidence value.
     */
    @Generated
    public Boolean isProvideFocusedSentenceEvidence() {
        return this.provideFocusedSentenceEvidence;
    }

    /**
     * Set the provideFocusedSentenceEvidence property: If this is true, provide the sentence that contains the first
     * token of the finding's clinical indicator (i.e. the medical problem), if there is one. This sentence is provided
     * as an extension with url 'ci_sentence', next to the token evidence. Default is false.
     *
     * @param provideFocusedSentenceEvidence the provideFocusedSentenceEvidence value to set.
     * @return the FindingOptions object itself.
     */
    @Generated
    public FindingOptions setProvideFocusedSentenceEvidence(Boolean provideFocusedSentenceEvidence) {
        this.provideFocusedSentenceEvidence = provideFocusedSentenceEvidence;
        return this;
    }
}
