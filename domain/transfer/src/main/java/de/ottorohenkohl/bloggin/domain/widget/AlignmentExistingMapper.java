package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.AlignmentExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class AlignmentExistingMapper implements FunctionalMapper<Alignment, AlignmentExisting> {
    
    @Inject
    AlignmentRepository repository;
}