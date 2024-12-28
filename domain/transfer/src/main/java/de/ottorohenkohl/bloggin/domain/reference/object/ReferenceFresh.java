package de.ottorohenkohl.bloggin.domain.reference.object;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ExternalFresh.class),
        @JsonSubTypes.Type(value = InternalFresh.class)
})
public sealed interface ReferenceFresh permits ExternalFresh, InternalFresh {
    
    String type();
}
