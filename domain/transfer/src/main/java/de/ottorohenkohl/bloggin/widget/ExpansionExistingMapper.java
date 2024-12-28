package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.ExpansionExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class ExpansionExistingMapper implements BinaryMapper<Expansion, ExpansionExisting> {
    
    @Inject
    ExpansionRepository repository;
}