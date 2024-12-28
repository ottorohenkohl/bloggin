package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.menu.object.ItemExisting;
import de.ottorohenkohl.bloggin.domain.reference.ReferenceExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, NameMapper.class, ReferenceExistingMapper.class, TypeMapper.class})
@Getter
public abstract class ItemExistingMapper extends ExistingMapper<Item, ItemExisting> {
    
    @Inject
    ItemRepository repository;
}