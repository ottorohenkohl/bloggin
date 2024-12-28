package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.HeaderFresh;
import de.ottorohenkohl.bloggin.domain.widget.value.TextMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TextMapper.class, IdentifierMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class HeaderFreshMapper implements ConsumingMapper<Header, HeaderFresh> {
    
    @Inject
    HeaderRepository repository;
}