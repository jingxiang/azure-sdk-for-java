// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceMarketingCloudSource;

public final class SalesforceMarketingCloudSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceMarketingCloudSource model = BinaryData.fromString(
            "{\"type\":\"SalesforceMarketingCloudSource\",\"query\":\"datadgnchahldnrpt\",\"queryTimeout\":\"datacapbkfvowzbk\",\"additionalColumns\":\"dataqpzdpu\",\"sourceRetryCount\":\"datawjmohqzzkplqmca\",\"sourceRetryWait\":\"dataeiauveeng\",\"maxConcurrentConnections\":\"datagfpqwwugfw\",\"disableMetricsCollection\":\"datajcewbqaibkyeys\",\"\":{\"xcjqdvcieqzkuixf\":\"datahdydyybztlylh\",\"rzieyxxidab\":\"dataghvecjhbttmhneq\",\"cseqo\":\"datalakkna\"}}")
            .toObject(SalesforceMarketingCloudSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceMarketingCloudSource model = new SalesforceMarketingCloudSource()
            .withSourceRetryCount("datawjmohqzzkplqmca").withSourceRetryWait("dataeiauveeng")
            .withMaxConcurrentConnections("datagfpqwwugfw").withDisableMetricsCollection("datajcewbqaibkyeys")
            .withQueryTimeout("datacapbkfvowzbk").withAdditionalColumns("dataqpzdpu").withQuery("datadgnchahldnrpt");
        model = BinaryData.fromObject(model).toObject(SalesforceMarketingCloudSource.class);
    }
}
