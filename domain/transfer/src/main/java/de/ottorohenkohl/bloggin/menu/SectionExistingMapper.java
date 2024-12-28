package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.ItemExisting;
import de.ottorohenkohl.bloggin.menu.object.SectionExisting;
import de.ottorohenkohl.bloggin.reference.ReferenceExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, ItemExistingMapper.class, NameMapper.class, TypeMapper.class})
@Getter
public abstract class SectionExistingMapper extends ExistingMapper<Section, SectionExisting> {
    
    @Inject
    SectionRepository repository;
}