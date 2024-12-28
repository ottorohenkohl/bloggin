package de.ottorohenkohl.bloggin.domain.widget.object;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@JsonTypeInfo(use = NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AlignmentFresh.class),
        @JsonSubTypes.Type(value = HeaderFresh.class),
        @JsonSubTypes.Type(value = ImageFresh.class),
        @JsonSubTypes.Type(value = ParagraphFresh.class),
        @JsonSubTypes.Type(value = SeparatorFresh.class)
})
public sealed interface WidgetFresh permits AlignmentFresh, ExpansionFresh, HeaderFresh, ImageFresh, ParagraphFresh, SeparatorFresh {
    
    WidgetFresh successor();
    
    String type();
}