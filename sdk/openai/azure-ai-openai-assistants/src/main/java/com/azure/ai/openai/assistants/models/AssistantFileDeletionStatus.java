// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of an assistant file deletion operation.
 */
@Immutable
public final class AssistantFileDeletionStatus {

    /*
     * The ID of the resource specified for deletion.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * A value indicating whether deletion was successful.
     */
    @Generated
    @JsonProperty(value = "deleted")
    private boolean deleted;

    /*
     * The object type, which is always 'assistant.file.deleted'.
     */
    @Generated
    @JsonProperty(value = "object")
    private String object = "assistant.file.deleted";

    /**
     * Creates an instance of AssistantFileDeletionStatus class.
     *
     * @param id the id value to set.
     * @param deleted the deleted value to set.
     */
    @Generated
    @JsonCreator
    private AssistantFileDeletionStatus(@JsonProperty(value = "id") String id,
        @JsonProperty(value = "deleted") boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * Get the id property: The ID of the resource specified for deletion.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the deleted property: A value indicating whether deletion was successful.
     *
     * @return the deleted value.
     */
    @Generated
    public boolean isDeleted() {
        return this.deleted;
    }

    /**
     * Get the object property: The object type, which is always 'assistant.file.deleted'.
     *
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }
}
