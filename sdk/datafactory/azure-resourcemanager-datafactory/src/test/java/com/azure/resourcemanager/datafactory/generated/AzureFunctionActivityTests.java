// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureFunctionActivity;
import com.azure.resourcemanager.datafactory.models.AzureFunctionActivityMethod;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureFunctionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFunctionActivity model = BinaryData.fromString(
            "{\"type\":\"AzureFunctionActivity\",\"typeProperties\":{\"method\":\"HEAD\",\"functionName\":\"datafexzzijtctfew\",\"headers\":{\"vqpwwv\":\"tzplwyl\"},\"body\":\"dataqsnttwlxvezoald\"},\"linkedServiceName\":{\"referenceName\":\"esxcqtosoanxi\",\"parameters\":{\"s\":\"dataiccgubuiv\",\"wybbda\":\"datafxnenhyhdusaykrj\",\"xmdacetjmap\":\"datadqttzslt\"}},\"policy\":{\"timeout\":\"dataaumqjx\",\"retry\":\"datardcxuiamrxlhfx\",\"retryIntervalInSeconds\":1561615229,\"secureInput\":true,\"secureOutput\":true,\"\":{\"zfyivvtxqp\":\"datat\"}},\"name\":\"mqogtohzfvysv\",\"description\":\"bjdihtxv\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"qdmzjppb\",\"dependencyConditions\":[\"Failed\",\"Failed\",\"Skipped\"],\"\":{\"tn\":\"datamz\",\"yyasildbqygnfxg\":\"dataxvt\",\"bkbjs\":\"datazqqwsvjhmqp\",\"pe\":\"datagkdvm\"}},{\"activity\":\"tfbgyznshoe\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Completed\",\"Succeeded\"],\"\":{\"g\":\"datahvuoavpoookhcur\"}},{\"activity\":\"jzznmjwqwyhhgs\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Completed\",\"Failed\"],\"\":{\"rxfbuywzpcxnbbs\":\"datanj\"}}],\"userProperties\":[{\"name\":\"alowmmhhuh\",\"value\":\"datawdc\"},{\"name\":\"vc\",\"value\":\"datafstceehqea\"},{\"name\":\"lfuj\",\"value\":\"dataovtakijwkw\"},{\"name\":\"druumldunalogw\",\"value\":\"dataikfqcbe\"}],\"\":{\"qiulwfzoszgbgtwa\":\"dataszucdvhqec\",\"vdaj\":\"datauiuzsnjjgnmpuqsj\",\"dtbgkxzx\":\"dataczlvcxmtwtbr\"}}")
            .toObject(AzureFunctionActivity.class);
        Assertions.assertEquals("mqogtohzfvysv", model.name());
        Assertions.assertEquals("bjdihtxv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("qdmzjppb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("alowmmhhuh", model.userProperties().get(0).name());
        Assertions.assertEquals("esxcqtosoanxi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1561615229, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(AzureFunctionActivityMethod.HEAD, model.method());
        Assertions.assertEquals("tzplwyl", model.headers().get("vqpwwv"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFunctionActivity model = new AzureFunctionActivity().withName("mqogtohzfvysv").withDescription("bjdihtxv")
            .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("qdmzjppb")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED,
                        DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("tfbgyznshoe")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED,
                        DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("jzznmjwqwyhhgs")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED,
                        DependencyCondition.COMPLETED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("alowmmhhuh").withValue("datawdc"),
                new UserProperty().withName("vc").withValue("datafstceehqea"),
                new UserProperty().withName("lfuj").withValue("dataovtakijwkw"),
                new UserProperty().withName("druumldunalogw").withValue("dataikfqcbe")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("esxcqtosoanxi").withParameters(
                mapOf("s", "dataiccgubuiv", "wybbda", "datafxnenhyhdusaykrj", "xmdacetjmap", "datadqttzslt")))
            .withPolicy(new ActivityPolicy().withTimeout("dataaumqjx").withRetry("datardcxuiamrxlhfx")
                .withRetryIntervalInSeconds(1561615229).withSecureInput(true).withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withMethod(AzureFunctionActivityMethod.HEAD).withFunctionName("datafexzzijtctfew")
            .withHeaders(mapOf("vqpwwv", "tzplwyl")).withBody("dataqsnttwlxvezoald");
        model = BinaryData.fromObject(model).toObject(AzureFunctionActivity.class);
        Assertions.assertEquals("mqogtohzfvysv", model.name());
        Assertions.assertEquals("bjdihtxv", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("qdmzjppb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("alowmmhhuh", model.userProperties().get(0).name());
        Assertions.assertEquals("esxcqtosoanxi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1561615229, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(AzureFunctionActivityMethod.HEAD, model.method());
        Assertions.assertEquals("tzplwyl", model.headers().get("vqpwwv"));
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
