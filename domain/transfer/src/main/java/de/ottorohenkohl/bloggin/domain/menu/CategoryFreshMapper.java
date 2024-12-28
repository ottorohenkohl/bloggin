package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.menu.object.CategoryFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, ItemFreshMapper.class, SectionFreshMapper.class, TypeMapper.class, NameMapper.class})
@Getter
public abstract class CategoryFreshMapper implements ConsumingMapper<Category, CategoryFresh> {
    
    @Inject
    SectionRepository repository;
}