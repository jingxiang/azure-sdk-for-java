// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RunQueryOrder;
import com.azure.resourcemanager.datafactory.models.RunQueryOrderBy;
import com.azure.resourcemanager.datafactory.models.RunQueryOrderByField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RunQueryOrderByTests {
    @Test
    public void testDeserialize() {
        RunQueryOrderBy model =
            BinaryData.fromString("{\"orderBy\":\"RunEnd\",\"order\":\"ASC\"}").toObject(RunQueryOrderBy.class);
        Assertions.assertEquals(RunQueryOrderByField.RUN_END, model.orderBy());
        Assertions.assertEquals(RunQueryOrder.ASC, model.order());
    }

    @Test
    public void testSerialize() {
        RunQueryOrderBy model =
            new RunQueryOrderBy().withOrderBy(RunQueryOrderByField.RUN_END).withOrder(RunQueryOrder.ASC);
        model = BinaryData.fromObject(model).toObject(RunQueryOrderBy.class);
        Assertions.assertEquals(RunQueryOrderByField.RUN_END, model.orderBy());
        Assertions.assertEquals(RunQueryOrder.ASC, model.order());
    }
}