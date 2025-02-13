// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateEndpointConnectionDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpoint;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointConnectionListResultDescription;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResultDescription model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"rcjd\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"hxbnjbiksqrg\",\"actionsRequired\":\"sainqpjwnzl\"},\"provisioningState\":\"Creating\"},\"id\":\"mppeebvmgxs\",\"name\":\"bkyqduu\",\"type\":\"itcjczdz\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"krwpdap\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"dkvwrwjfe\",\"actionsRequired\":\"nhutjeltmrldhugj\"},\"provisioningState\":\"Failed\"},\"id\":\"atqxho\",\"name\":\"dgeablgphu\",\"type\":\"icndvkaozwyifty\"}]}")
            .toObject(PrivateEndpointConnectionListResultDescription.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hxbnjbiksqrg", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("sainqpjwnzl",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResultDescription model
            = new PrivateEndpointConnectionListResultDescription().withValue(Arrays.asList(
                new PrivateEndpointConnectionDescriptionInner().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED).withDescription("hxbnjbiksqrg")
                        .withActionsRequired("sainqpjwnzl")),
                new PrivateEndpointConnectionDescriptionInner().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING).withDescription("dkvwrwjfe")
                        .withActionsRequired("nhutjeltmrldhugj"))));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResultDescription.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hxbnjbiksqrg", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("sainqpjwnzl",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }
}
