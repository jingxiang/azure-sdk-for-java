// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MediaStreamingContentTypeDto. */
public final class MediaStreamingContentTypeDto extends ExpandableStringEnum<MediaStreamingContentTypeDto> {
    /** Static value audio for MediaStreamingContentTypeDto. */
    public static final MediaStreamingContentTypeDto AUDIO = fromString("audio");

    /**
     * Creates or finds a MediaStreamingContentTypeDto from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingContentTypeDto.
     */
    @JsonCreator
    public static MediaStreamingContentTypeDto fromString(String name) {
        return fromString(name, MediaStreamingContentTypeDto.class);
    }

    /** @return known MediaStreamingContentTypeDto values. */
    public static Collection<MediaStreamingContentTypeDto> values() {
        return values(MediaStreamingContentTypeDto.class);
    }
}