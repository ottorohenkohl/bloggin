package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.ExpansionFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class ExpansionFreshMapper implements UnaryMapper<Expansion, ExpansionFresh> {
    
    @Inject
    ExpansionRepository repository;
}