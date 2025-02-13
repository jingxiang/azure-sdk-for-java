// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.WorkspaceSettingInner;
import com.azure.resourcemanager.security.models.WorkspaceSettingList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceSettingListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceSettingList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"workspaceId\":\"pv\",\"scope\":\"srp\"},\"id\":\"vu\",\"name\":\"zraehtwd\",\"type\":\"r\"},{\"properties\":{\"workspaceId\":\"swibyr\",\"scope\":\"dl\"},\"id\":\"h\",\"name\":\"hfwpracstwit\",\"type\":\"khevxccedc\"},{\"properties\":{\"workspaceId\":\"md\",\"scope\":\"odn\"},\"id\":\"zxltjcvn\",\"name\":\"ltiugcxnavv\",\"type\":\"xqi\"}],\"nextLink\":\"qunyowxwlmdjr\"}")
                .toObject(WorkspaceSettingList.class);
        Assertions.assertEquals("pv", model.value().get(0).workspaceId());
        Assertions.assertEquals("srp", model.value().get(0).scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceSettingList model =
            new WorkspaceSettingList()
                .withValue(
                    Arrays
                        .asList(
                            new WorkspaceSettingInner().withWorkspaceId("pv").withScope("srp"),
                            new WorkspaceSettingInner().withWorkspaceId("swibyr").withScope("dl"),
                            new WorkspaceSettingInner().withWorkspaceId("md").withScope("odn")));
        model = BinaryData.fromObject(model).toObject(WorkspaceSettingList.class);
        Assertions.assertEquals("pv", model.value().get(0).workspaceId());
        Assertions.assertEquals("srp", model.value().get(0).scope());
    }
}
