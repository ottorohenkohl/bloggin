package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.SeparatorFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class SeparatorFreshMapper implements ConsumingMapper<Separator, SeparatorFresh> {
    
    @Inject
    SeparatorRepository repository;
}