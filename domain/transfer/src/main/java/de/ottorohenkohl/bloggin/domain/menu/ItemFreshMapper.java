package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.menu.object.ItemFresh;
import de.ottorohenkohl.bloggin.domain.reference.ReferenceFreshMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, NameMapper.class, ReferenceFreshMapper.class})
@Getter
public abstract class ItemFreshMapper implements ConsumingMapper<Item, ItemFresh> {
    
    @Inject
    ItemRepository repository;
}