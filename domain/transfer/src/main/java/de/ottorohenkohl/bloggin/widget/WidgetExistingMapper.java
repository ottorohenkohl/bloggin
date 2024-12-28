package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.*;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class WidgetExistingMapper implements BinaryMapper<Widget, WidgetExisting> {
    
    @Inject
    AlignmentExistingMapper alignmentExistingMapper;
    @Inject
    ExpansionExistingMapper expansionExistingMapper;
    @Inject
    HeaderExistingMapper headerExistingMapper;
    @Inject
    ImageExistingMapper imageExistingMapper;
    @Inject
    ParagraphExistingMapper paragraphExistingMapper;
    @Inject
    SeparatorExistingMapper separatorExistingMapper;
    
    @Inject
    WidgetVisitor widgetVisitor;
    
    @Override
    public Widget parse(WidgetExisting widgetExisting) {
        return switch (widgetExisting) {
            case AlignmentExisting alignmentExisting -> alignmentExistingMapper.parse(alignmentExisting);
            case ExpansionExisting expansionExisting -> expansionExistingMapper.parse(expansionExisting);
            case HeaderExisting headerExisting -> headerExistingMapper.parse(headerExisting);
            case ImageExisting imageExisting -> imageExistingMapper.parse(imageExisting);
            case ParagraphExisting paragraphExisting -> paragraphExistingMapper.parse(paragraphExisting);
            case SeparatorExisting separatorExisting -> separatorExistingMapper.parse(separatorExisting);
        };
    }
    
    @Override
    public WidgetExisting export(Widget widget) {
        return widget.accept(widgetVisitor);
    }
}