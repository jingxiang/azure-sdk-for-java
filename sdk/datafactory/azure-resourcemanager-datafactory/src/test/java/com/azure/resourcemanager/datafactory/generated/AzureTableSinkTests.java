// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureTableSink;
import org.junit.jupiter.api.Test;

public final class AzureTableSinkTests {
    @Test
    public void testDeserialize() {
        AzureTableSink model =
            BinaryData.fromString("{\"type\":\"AzureTableSink\",\"\":{}}").toObject(AzureTableSink.class);
    }

    @Test
    public void testSerialize() {
        AzureTableSink model = new AzureTableSink();
        model = BinaryData.fromObject(model).toObject(AzureTableSink.class);
    }
}