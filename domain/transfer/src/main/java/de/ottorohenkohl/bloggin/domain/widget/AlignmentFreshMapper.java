package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.AlignmentFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TypeMapper.class, IdentifierMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class AlignmentFreshMapper implements ConsumingMapper<Alignment, AlignmentFresh> {
    
    @Inject
    AlignmentRepository repository;
}