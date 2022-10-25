// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRestoreWithRehydrateRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSapHanaRestoreWithRehydrateRequestTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSapHanaRestoreWithRehydrateRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaRestoreWithRehydrateRequest\",\"recoveryPointRehydrationInfo\":{\"rehydrationRetentionDuration\":\"cyefoyzbamwine\",\"rehydrationPriority\":\"High\"},\"recoveryType\":\"OriginalLocation\",\"sourceResourceId\":\"kpoldtvevboc\",\"propertyBag\":{\"ttxpnrupza\":\"zjknyuxg\",\"swyskbruffg\":\"mrdixtreki\"},\"targetInfo\":{\"overwriteOption\":\"Overwrite\",\"containerId\":\"utvlxhr\",\"databaseName\":\"hvmblcouqehbhbc\",\"targetDirectoryForFileRestore\":\"ziryrandoy\"},\"recoveryMode\":\"Invalid\",\"targetVirtualMachineId\":\"t\"}")
                .toObject(AzureWorkloadSapHanaRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.ORIGINAL_LOCATION, model.recoveryType());
        Assertions.assertEquals("kpoldtvevboc", model.sourceResourceId());
        Assertions.assertEquals("zjknyuxg", model.propertyBag().get("ttxpnrupza"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("utvlxhr", model.targetInfo().containerId());
        Assertions.assertEquals("hvmblcouqehbhbc", model.targetInfo().databaseName());
        Assertions.assertEquals("ziryrandoy", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("t", model.targetVirtualMachineId());
        Assertions.assertEquals("cyefoyzbamwine", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSapHanaRestoreWithRehydrateRequest model =
            new AzureWorkloadSapHanaRestoreWithRehydrateRequest()
                .withRecoveryType(RecoveryType.ORIGINAL_LOCATION)
                .withSourceResourceId("kpoldtvevboc")
                .withPropertyBag(mapOf("ttxpnrupza", "zjknyuxg", "swyskbruffg", "mrdixtreki"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.OVERWRITE)
                        .withContainerId("utvlxhr")
                        .withDatabaseName("hvmblcouqehbhbc")
                        .withTargetDirectoryForFileRestore("ziryrandoy"))
                .withRecoveryMode(RecoveryMode.INVALID)
                .withTargetVirtualMachineId("t")
                .withRecoveryPointRehydrationInfo(
                    new RecoveryPointRehydrationInfo()
                        .withRehydrationRetentionDuration("cyefoyzbamwine")
                        .withRehydrationPriority(RehydrationPriority.HIGH));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.ORIGINAL_LOCATION, model.recoveryType());
        Assertions.assertEquals("kpoldtvevboc", model.sourceResourceId());
        Assertions.assertEquals("zjknyuxg", model.propertyBag().get("ttxpnrupza"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("utvlxhr", model.targetInfo().containerId());
        Assertions.assertEquals("hvmblcouqehbhbc", model.targetInfo().databaseName());
        Assertions.assertEquals("ziryrandoy", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("t", model.targetVirtualMachineId());
        Assertions.assertEquals("cyefoyzbamwine", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

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