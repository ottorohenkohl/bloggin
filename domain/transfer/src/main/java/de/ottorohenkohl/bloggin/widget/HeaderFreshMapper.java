package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.HeaderFresh;
import de.ottorohenkohl.bloggin.widget.value.TextMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TextMapper.class, IdentifierMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class HeaderFreshMapper implements UnaryMapper<Header, HeaderFresh> {
    
    @Inject
    HeaderRepository repository;
}