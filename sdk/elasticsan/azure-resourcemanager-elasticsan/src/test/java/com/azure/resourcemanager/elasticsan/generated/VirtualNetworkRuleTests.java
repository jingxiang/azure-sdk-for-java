// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.Action;
import com.azure.resourcemanager.elasticsan.models.VirtualNetworkRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworkRuleTests {
    @Test
    public void testDeserialize() {
        VirtualNetworkRule model =
            BinaryData
                .fromString("{\"id\":\"vhkhixu\",\"action\":\"Allow\",\"state\":\"deprovisioning\"}")
                .toObject(VirtualNetworkRule.class);
        Assertions.assertEquals("vhkhixu", model.virtualNetworkResourceId());
        Assertions.assertEquals(Action.ALLOW, model.action());
    }

    @Test
    public void testSerialize() {
        VirtualNetworkRule model =
            new VirtualNetworkRule().withVirtualNetworkResourceId("vhkhixu").withAction(Action.ALLOW);
        model = BinaryData.fromObject(model).toObject(VirtualNetworkRule.class);
        Assertions.assertEquals("vhkhixu", model.virtualNetworkResourceId());
        Assertions.assertEquals(Action.ALLOW, model.action());
    }
}