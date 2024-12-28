package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.CategoryFresh;
import de.ottorohenkohl.bloggin.menu.object.MenuFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {CategoryFreshMapper.class, IdentifierMapper.class, ItemFreshMapper.class, TypeMapper.class, NameMapper.class})
@Getter
public abstract class MenuFreshMapper implements UnaryMapper<Menu, MenuFresh> {
    
    @Inject
    MenuRepository repository;
}