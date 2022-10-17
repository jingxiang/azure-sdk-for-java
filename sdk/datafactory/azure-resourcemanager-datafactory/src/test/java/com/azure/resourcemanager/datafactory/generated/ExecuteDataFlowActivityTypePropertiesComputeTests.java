// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import org.junit.jupiter.api.Test;

public final class ExecuteDataFlowActivityTypePropertiesComputeTests {
    @Test
    public void testDeserialize() {
        ExecuteDataFlowActivityTypePropertiesCompute model =
            BinaryData.fromString("{}").toObject(ExecuteDataFlowActivityTypePropertiesCompute.class);
    }

    @Test
    public void testSerialize() {
        ExecuteDataFlowActivityTypePropertiesCompute model = new ExecuteDataFlowActivityTypePropertiesCompute();
        model = BinaryData.fromObject(model).toObject(ExecuteDataFlowActivityTypePropertiesCompute.class);
    }
}