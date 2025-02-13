// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapTableResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapTableResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapTableResourceDataset model = BinaryData.fromString(
            "{\"type\":\"SapTableResource\",\"typeProperties\":{\"tableName\":\"dataycdzdob\"},\"description\":\"sdyvfxnzpfd\",\"structure\":\"datapk\",\"schema\":\"datapdpsegiv\",\"linkedServiceName\":{\"referenceName\":\"tabvbbkflewgsl\",\"parameters\":{\"vedwuu\":\"datab\",\"wclykcr\":\"databmenxcqs\",\"bnjrevmpted\":\"datadek\",\"shnfiygpgpkkhp\":\"datauent\"}},\"parameters\":{\"ihnmtrdlpxiwwg\":{\"type\":\"Float\",\"defaultValue\":\"dataql\"},\"fivxdifb\":{\"type\":\"Float\",\"defaultValue\":\"datavfpnrzikvoxloeoh\"}},\"annotations\":[\"dataijhpxukxgoyxontb\",\"datadqrxro\",\"datauqr\"],\"folder\":{\"name\":\"xfuaefewx\"},\"\":{\"mdcizhvk\":\"datatwjrppifeyrqvel\",\"pzwyncwksmpyeyzo\":\"databojklw\",\"uduiqoom\":\"databfnflytf\",\"opwsnliyznghuq\":\"dataswkq\"}}")
            .toObject(SapTableResourceDataset.class);
        Assertions.assertEquals("sdyvfxnzpfd", model.description());
        Assertions.assertEquals("tabvbbkflewgsl", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ihnmtrdlpxiwwg").type());
        Assertions.assertEquals("xfuaefewx", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapTableResourceDataset model = new SapTableResourceDataset().withDescription("sdyvfxnzpfd")
            .withStructure("datapk").withSchema("datapdpsegiv")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("tabvbbkflewgsl")
                .withParameters(mapOf("vedwuu", "datab", "wclykcr", "databmenxcqs", "bnjrevmpted", "datadek",
                    "shnfiygpgpkkhp", "datauent")))
            .withParameters(mapOf("ihnmtrdlpxiwwg",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataql"), "fivxdifb",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datavfpnrzikvoxloeoh")))
            .withAnnotations(Arrays.asList("dataijhpxukxgoyxontb", "datadqrxro", "datauqr"))
            .withFolder(new DatasetFolder().withName("xfuaefewx")).withTableName("dataycdzdob");
        model = BinaryData.fromObject(model).toObject(SapTableResourceDataset.class);
        Assertions.assertEquals("sdyvfxnzpfd", model.description());
        Assertions.assertEquals("tabvbbkflewgsl", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ihnmtrdlpxiwwg").type());
        Assertions.assertEquals("xfuaefewx", model.folder().name());
    }

    // Use "Map.of" if available
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
