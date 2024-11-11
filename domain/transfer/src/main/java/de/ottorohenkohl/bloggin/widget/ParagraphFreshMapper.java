package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.ParagraphFresh;
import de.ottorohenkohl.bloggin.widget.value.TextMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TextMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class ParagraphFreshMapper implements UnaryMapper<Paragraph, ParagraphFresh> {
    
    @Inject
    ParagraphRepository repository;
}