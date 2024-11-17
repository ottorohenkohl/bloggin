package de.ottorohenkohl.bloggin.domain.widget.object;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AlignmentExisting.class),
        @JsonSubTypes.Type(value = HeaderExisting.class),
        @JsonSubTypes.Type(value = ImageExisting.class),
        @JsonSubTypes.Type(value = ParagraphExisting.class),
        @JsonSubTypes.Type(value = SeparatorExisting.class)
})
public sealed interface WidgetExisting permits AlignmentExisting, ExpansionExisting, HeaderExisting, ImageExisting, ParagraphExisting, SeparatorExisting {
    
    String identifier();
    
    WidgetExisting successor();
    
    String type();
}