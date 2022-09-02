// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Jobs are distributed to the worker with the strongest abilities available. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("best-worker")
@Fluent
public final class BestWorkerMode extends DistributionMode {
    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule providing static rules that always return the same
     * result, regardless of input.
     * DirectMapRule:  A rule that return the same labels as the input labels.
     * ExpressionRule: A rule providing inline expression rules.
     * AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     */
    @JsonProperty(value = "scoringRule")
    private RouterRule scoringRule;

    /*
     * Encapsulates all options that can be passed as parameters for scoring
     * rule with BestWorkerMode
     */
    @JsonProperty(value = "scoringRuleOptions")
    private ScoringRuleOptions scoringRuleOptions;

    /**
     * Get the scoringRule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
     *
     * @return the scoringRule value.
     */
    public RouterRule getScoringRule() {
        return this.scoringRule;
    }

    /**
     * Set the scoringRule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
     *
     * @param scoringRule the scoringRule value to set.
     * @return the BestWorkerMode object itself.
     */
    public BestWorkerMode setScoringRule(RouterRule scoringRule) {
        this.scoringRule = scoringRule;
        return this;
    }

    /**
     * Get the scoringRuleOptions property: Encapsulates all options that can be passed as parameters for scoring rule
     * with BestWorkerMode.
     *
     * @return the scoringRuleOptions value.
     */
    public ScoringRuleOptions getScoringRuleOptions() {
        return this.scoringRuleOptions;
    }

    /**
     * Set the scoringRuleOptions property: Encapsulates all options that can be passed as parameters for scoring rule
     * with BestWorkerMode.
     *
     * @param scoringRuleOptions the scoringRuleOptions value to set.
     * @return the BestWorkerMode object itself.
     */
    public BestWorkerMode setScoringRuleOptions(ScoringRuleOptions scoringRuleOptions) {
        this.scoringRuleOptions = scoringRuleOptions;
        return this;
    }
}