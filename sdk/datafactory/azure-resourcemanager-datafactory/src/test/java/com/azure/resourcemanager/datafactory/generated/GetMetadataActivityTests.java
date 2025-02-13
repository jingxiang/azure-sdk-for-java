// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.FormatReadSettings;
import com.azure.resourcemanager.datafactory.models.GetMetadataActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GetMetadataActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetMetadataActivity model = BinaryData.fromString(
            "{\"type\":\"GetMetadata\",\"typeProperties\":{\"dataset\":{\"referenceName\":\"emaxoa\",\"parameters\":{\"yxajkkzkzprjq\":\"datakcachsojgag\",\"xwynzbeemlsrtgb\":\"datamg\"}},\"fieldList\":[\"datautukwdglp\"],\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datauhbdmmfdrxyejjqc\",\"disableMetricsCollection\":\"datavbahiiatpdxpox\",\"\":{\"wxuyikgmlplqgps\":\"datapsmxfchnhjsaq\",\"lvwtslzblgvezhim\":\"dataynkkezkv\",\"dzkovt\":\"dataiyqwlxkyoysyutnr\",\"ayupa\":\"datanmcaprxhixmybl\"}},\"formatSettings\":{\"type\":\"FormatReadSettings\",\"\":{\"vhcboi\":\"dataumpunwyf\"}}},\"linkedServiceName\":{\"referenceName\":\"hghicwvh\",\"parameters\":{\"t\":\"datavj\",\"m\":\"datapyanooytil\",\"wqljmmoquicrz\":\"datas\",\"zh\":\"dataluqacebcn\"}},\"policy\":{\"timeout\":\"datamjuruspfl\",\"retry\":\"datalvwkgcpfz\",\"retryIntervalInSeconds\":741825405,\"secureInput\":true,\"secureOutput\":false,\"\":{\"qqmvsrbmfobtmljo\":\"datax\"}},\"name\":\"guoyo\",\"description\":\"yg\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"ebyczwegt\",\"dependencyConditions\":[\"Skipped\"],\"\":{\"rgmidvtu\":\"datazqxxvksqi\"}},{\"activity\":\"dgl\",\"dependencyConditions\":[\"Failed\",\"Completed\"],\"\":{\"dlt\":\"datal\",\"jnlxjhrzgnfqq\":\"dataryhztwxuizakejo\",\"eokrarzkzatznvye\":\"datagqezgbqiiweoa\"}}],\"userProperties\":[{\"name\":\"vzomtzpukmxgs\",\"value\":\"datazbpn\"},{\"name\":\"f\",\"value\":\"dataqwmx\"}],\"\":{\"bofzmvtwyjc\":\"datawzesejdcpcpeu\",\"jlbygq\":\"datajrptltytbqhejhn\",\"slxzwvygquiwcfq\":\"datameeuuurx\",\"wwdev\":\"dataob\"}}")
            .toObject(GetMetadataActivity.class);
        Assertions.assertEquals("guoyo", model.name());
        Assertions.assertEquals("yg", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ebyczwegt", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vzomtzpukmxgs", model.userProperties().get(0).name());
        Assertions.assertEquals("hghicwvh", model.linkedServiceName().referenceName());
        Assertions.assertEquals(741825405, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("emaxoa", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetMetadataActivity model = new GetMetadataActivity().withName("guoyo").withDescription("yg")
            .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("ebyczwegt")
                .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED)).withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("dgl")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("vzomtzpukmxgs").withValue("datazbpn"),
                new UserProperty().withName("f").withValue("dataqwmx")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("hghicwvh").withParameters(
                mapOf("t", "datavj", "m", "datapyanooytil", "wqljmmoquicrz", "datas", "zh", "dataluqacebcn")))
            .withPolicy(new ActivityPolicy().withTimeout("datamjuruspfl").withRetry("datalvwkgcpfz")
                .withRetryIntervalInSeconds(741825405).withSecureInput(true).withSecureOutput(false)
                .withAdditionalProperties(mapOf()))
            .withDataset(new DatasetReference().withReferenceName("emaxoa")
                .withParameters(mapOf("yxajkkzkzprjq", "datakcachsojgag", "xwynzbeemlsrtgb", "datamg")))
            .withFieldList(Arrays.asList("datautukwdglp"))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datauhbdmmfdrxyejjqc")
                .withDisableMetricsCollection("datavbahiiatpdxpox")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withFormatSettings(new FormatReadSettings().withAdditionalProperties(mapOf("type", "FormatReadSettings")));
        model = BinaryData.fromObject(model).toObject(GetMetadataActivity.class);
        Assertions.assertEquals("guoyo", model.name());
        Assertions.assertEquals("yg", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("ebyczwegt", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vzomtzpukmxgs", model.userProperties().get(0).name());
        Assertions.assertEquals("hghicwvh", model.linkedServiceName().referenceName());
        Assertions.assertEquals(741825405, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("emaxoa", model.dataset().referenceName());
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
