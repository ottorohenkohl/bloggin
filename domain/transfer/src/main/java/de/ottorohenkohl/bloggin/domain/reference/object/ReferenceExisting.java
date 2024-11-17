package de.ottorohenkohl.bloggin.domain.reference.object;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ExternalExisting.class),
        @JsonSubTypes.Type(value = InternalExisting.class)
})
public sealed interface ReferenceExisting permits ExternalExisting, InternalExisting {
    
    String identifier();
    
    String type();
}