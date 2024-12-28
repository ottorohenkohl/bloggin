package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.CategoryExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, ItemExistingMapper.class, NameMapper.class, SectionExistingMapper.class, TypeMapper.class})
@Getter
public abstract class CategoryExistingMapper extends ExistingMapper<Category, CategoryExisting> {
    
    @Inject
    CategoryRepository repository;
}