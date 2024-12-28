package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.ParagraphExisting;
import de.ottorohenkohl.bloggin.domain.widget.value.TextMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TextMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class ParagraphExistingMapper implements FunctionalMapper<Paragraph, ParagraphExisting> {
    
    @Inject
    ParagraphRepository repository;
}