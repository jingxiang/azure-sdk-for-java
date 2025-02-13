// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DataLakeAnalyticsUsqlActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataLakeAnalyticsUsqlActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataLakeAnalyticsUsqlActivity model = BinaryData.fromString(
            "{\"type\":\"DataLakeAnalyticsU-SQL\",\"typeProperties\":{\"scriptPath\":\"datamvxnumvorosq\",\"scriptLinkedService\":{\"referenceName\":\"sspw\",\"parameters\":{\"spw\":\"datajr\",\"umqmor\":\"dataiitzbyue\"}},\"degreeOfParallelism\":\"datapsflmwduisrvlun\",\"priority\":\"dataenererzthcfnrles\",\"parameters\":{\"czzlkmtrrcbulvau\":\"datacfqzmjmf\",\"rqjsmhkqzvarqi\":\"datakgklqucxewcd\"},\"runtimeVersion\":\"datadllhi\",\"compilationMode\":\"datanvxhxzabxhmdorx\"},\"linkedServiceName\":{\"referenceName\":\"aprksoeq\",\"parameters\":{\"w\":\"datatibadrcyexbjaktg\"}},\"policy\":{\"timeout\":\"datashghorgjidr\",\"retry\":\"dataqcwcdbt\",\"retryIntervalInSeconds\":1188826110,\"secureInput\":true,\"secureOutput\":true,\"\":{\"imhjbxwr\":\"datasuaazkouvvgcw\",\"z\":\"datagaofwo\",\"bnx\":\"dataxp\",\"ys\":\"datam\"}},\"name\":\"shbuxjhqu\",\"description\":\"rhcghnclfahryuzt\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"tcptpqoajgg\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Skipped\",\"Skipped\"],\"\":{\"vnjzaa\":\"datalsxzfycnp\",\"axfjuzgslqpzdxw\":\"dataxwcptoihoyv\"}}],\"userProperties\":[{\"name\":\"lgczvfb\",\"value\":\"datazscepogg\"},{\"name\":\"ppufueiaie\",\"value\":\"dataexyiuhjqd\"},{\"name\":\"lxabtlmszq\",\"value\":\"dataudai\"},{\"name\":\"fqnxjkopivsz\",\"value\":\"datajbpt\"}],\"\":{\"vlo\":\"dataabzjem\",\"nbqsjzncg\":\"datauca\",\"y\":\"datahpqgi\",\"xnxgv\":\"dataojimussvurslw\"}}")
            .toObject(DataLakeAnalyticsUsqlActivity.class);
        Assertions.assertEquals("shbuxjhqu", model.name());
        Assertions.assertEquals("rhcghnclfahryuzt", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("tcptpqoajgg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("lgczvfb", model.userProperties().get(0).name());
        Assertions.assertEquals("aprksoeq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1188826110, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("sspw", model.scriptLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataLakeAnalyticsUsqlActivity model
            = new DataLakeAnalyticsUsqlActivity().withName("shbuxjhqu").withDescription("rhcghnclfahryuzt")
                .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("tcptpqoajgg")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SKIPPED,
                        DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                    .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("lgczvfb").withValue("datazscepogg"),
                    new UserProperty().withName("ppufueiaie").withValue("dataexyiuhjqd"),
                    new UserProperty().withName("lxabtlmszq").withValue("dataudai"),
                    new UserProperty().withName("fqnxjkopivsz").withValue("datajbpt")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("aprksoeq")
                    .withParameters(mapOf("w", "datatibadrcyexbjaktg")))
                .withPolicy(new ActivityPolicy()
                    .withTimeout("datashghorgjidr").withRetry("dataqcwcdbt").withRetryIntervalInSeconds(1188826110)
                    .withSecureInput(true).withSecureOutput(true).withAdditionalProperties(mapOf()))
                .withScriptPath("datamvxnumvorosq")
                .withScriptLinkedService(new LinkedServiceReference().withReferenceName("sspw")
                    .withParameters(mapOf("spw", "datajr", "umqmor", "dataiitzbyue")))
                .withDegreeOfParallelism("datapsflmwduisrvlun").withPriority("dataenererzthcfnrles")
                .withParameters(mapOf("czzlkmtrrcbulvau", "datacfqzmjmf", "rqjsmhkqzvarqi", "datakgklqucxewcd"))
                .withRuntimeVersion("datadllhi").withCompilationMode("datanvxhxzabxhmdorx");
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsUsqlActivity.class);
        Assertions.assertEquals("shbuxjhqu", model.name());
        Assertions.assertEquals("rhcghnclfahryuzt", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("tcptpqoajgg", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("lgczvfb", model.userProperties().get(0).name());
        Assertions.assertEquals("aprksoeq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1188826110, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("sspw", model.scriptLinkedService().referenceName());
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
