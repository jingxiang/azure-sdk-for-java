// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MariaDBLinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MariaDBLinkedServiceTests {
    @Test
    public void testDeserialize() {
        MariaDBLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"MariaDB\",\"typeProperties\":{\"pwd\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"oka\",\"parameters\":{}},\"description\":\"jvqntt\",\"parameters\":{\"bzfivfok\":{\"type\":\"Float\"}},\"annotations\":[],\"\":{}}")
                .toObject(MariaDBLinkedService.class);
        Assertions.assertEquals("oka", model.connectVia().referenceName());
        Assertions.assertEquals("jvqntt", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("bzfivfok").type());
    }

    @Test
    public void testSerialize() {
        MariaDBLinkedService model =
            new MariaDBLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("oka").withParameters(mapOf()))
                .withDescription("jvqntt")
                .withParameters(mapOf("bzfivfok", new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withPwd(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(MariaDBLinkedService.class);
        Assertions.assertEquals("oka", model.connectVia().referenceName());
        Assertions.assertEquals("jvqntt", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("bzfivfok").type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}