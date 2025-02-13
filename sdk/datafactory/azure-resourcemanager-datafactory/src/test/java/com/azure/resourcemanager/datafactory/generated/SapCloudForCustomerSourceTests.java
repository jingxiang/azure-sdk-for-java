// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSource;

public final class SapCloudForCustomerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCloudForCustomerSource model = BinaryData.fromString(
            "{\"type\":\"SapCloudForCustomerSource\",\"query\":\"datarabbyfhz\",\"httpRequestTimeout\":\"datajrxenpkxanlbrcy\",\"queryTimeout\":\"datarc\",\"additionalColumns\":\"dataanbw\",\"sourceRetryCount\":\"datalqioq\",\"sourceRetryWait\":\"dataxcg\",\"maxConcurrentConnections\":\"datazluilzgpghjakzmn\",\"disableMetricsCollection\":\"datanqmajs\",\"\":{\"yupgojrwpoxu\":\"datajlpbxvp\"}}")
            .toObject(SapCloudForCustomerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerSource model = new SapCloudForCustomerSource().withSourceRetryCount("datalqioq")
            .withSourceRetryWait("dataxcg").withMaxConcurrentConnections("datazluilzgpghjakzmn")
            .withDisableMetricsCollection("datanqmajs").withQueryTimeout("datarc").withAdditionalColumns("dataanbw")
            .withQuery("datarabbyfhz").withHttpRequestTimeout("datajrxenpkxanlbrcy");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSource.class);
    }
}
