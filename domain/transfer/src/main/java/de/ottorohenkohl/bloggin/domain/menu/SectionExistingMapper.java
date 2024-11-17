package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.menu.object.SectionExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, ItemExistingMapper.class, NameMapper.class, TypeMapper.class})
@Getter
public abstract class SectionExistingMapper extends ExistingMapper<Section, SectionExisting> {
    
    @Inject
    SectionRepository repository;
}