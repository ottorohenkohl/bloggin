package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.*;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class WidgetFreshMapper implements ConsumingMapper<Widget, WidgetFresh> {
    
    @Inject
    AlignmentFreshMapper alignmentFreshMapper;
    @Inject
    ExpansionFreshMapper expansionFreshMapper;
    @Inject
    HeaderFreshMapper headerFreshMapper;
    @Inject
    ImageFreshMapper imageFreshMapper;
    @Inject
    ParagraphFreshMapper paragraphFreshMapper;
    @Inject
    SeparatorFreshMapper separatorFreshMapper;
    
    @Override
    public Widget parse(WidgetFresh widgetFresh) {
        return switch (widgetFresh) {
            case AlignmentFresh alignmentFresh -> alignmentFreshMapper.parse(alignmentFresh);
            case ExpansionFresh expansionFresh -> expansionFreshMapper.parse(expansionFresh);
            case HeaderFresh headerFresh -> headerFreshMapper.parse(headerFresh);
            case ImageFresh imageFresh -> imageFreshMapper.parse(imageFresh);
            case ParagraphFresh paragraphFresh -> paragraphFreshMapper.parse(paragraphFresh);
            case SeparatorFresh separatorFresh -> separatorFreshMapper.parse(separatorFresh);
        };
    }
}