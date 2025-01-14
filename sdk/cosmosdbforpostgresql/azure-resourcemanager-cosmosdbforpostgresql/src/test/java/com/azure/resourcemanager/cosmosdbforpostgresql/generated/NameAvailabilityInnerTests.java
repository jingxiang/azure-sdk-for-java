// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.NameAvailabilityInner;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityInner model =
            BinaryData
                .fromString(
                    "{\"message\":\"rjfeallnwsubisnj\",\"nameAvailable\":false,\"name\":\"ngnzscxaqwoochc\",\"type\":\"nqvpkvlrxnje\"}")
                .toObject(NameAvailabilityInner.class);
        Assertions.assertEquals("rjfeallnwsubisnj", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("ngnzscxaqwoochc", model.name());
        Assertions.assertEquals("nqvpkvlrxnje", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityInner model =
            new NameAvailabilityInner()
                .withMessage("rjfeallnwsubisnj")
                .withNameAvailable(false)
                .withName("ngnzscxaqwoochc")
                .withType("nqvpkvlrxnje");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityInner.class);
        Assertions.assertEquals("rjfeallnwsubisnj", model.message());
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("ngnzscxaqwoochc", model.name());
        Assertions.assertEquals("nqvpkvlrxnje", model.type());
    }
}
