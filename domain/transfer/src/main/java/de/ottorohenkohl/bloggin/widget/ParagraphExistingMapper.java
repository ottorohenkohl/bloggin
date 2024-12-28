package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.ParagraphExisting;
import de.ottorohenkohl.bloggin.widget.value.TextMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TextMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class ParagraphExistingMapper implements BinaryMapper<Paragraph, ParagraphExisting> {
    
    @Inject
    ParagraphRepository repository;
}