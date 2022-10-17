// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreWriteSettings;
import org.junit.jupiter.api.Test;

public final class AzureDataLakeStoreWriteSettingsTests {
    @Test
    public void testDeserialize() {
        AzureDataLakeStoreWriteSettings model =
            BinaryData
                .fromString("{\"type\":\"AzureDataLakeStoreWriteSettings\",\"\":{}}")
                .toObject(AzureDataLakeStoreWriteSettings.class);
    }

    @Test
    public void testSerialize() {
        AzureDataLakeStoreWriteSettings model = new AzureDataLakeStoreWriteSettings();
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreWriteSettings.class);
    }
}