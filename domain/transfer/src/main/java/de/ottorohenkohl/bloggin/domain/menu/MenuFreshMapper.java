package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.menu.object.MenuFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {CategoryFreshMapper.class, IdentifierMapper.class, ItemFreshMapper.class, TypeMapper.class, NameMapper.class})
@Getter
public abstract class MenuFreshMapper implements ConsumingMapper<Menu, MenuFresh> {
    
    @Inject
    MenuRepository repository;
}