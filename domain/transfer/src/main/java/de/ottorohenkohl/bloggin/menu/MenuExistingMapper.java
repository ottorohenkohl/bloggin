package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.CategoryExisting;
import de.ottorohenkohl.bloggin.menu.object.MenuExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {CategoryRepository.class, IdentifierMapper.class, ItemExistingMapper.class, NameMapper.class, TypeMapper.class})
@Getter
public abstract class MenuExistingMapper extends ExistingMapper<Menu, MenuExisting> {
    
    @Inject
    MenuRepository repository;
}