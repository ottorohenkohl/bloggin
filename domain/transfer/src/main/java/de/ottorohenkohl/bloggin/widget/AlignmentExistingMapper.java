package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.AlignmentExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class AlignmentExistingMapper implements BinaryMapper<Alignment, AlignmentExisting> {
    
    @Inject
    AlignmentRepository repository;
}