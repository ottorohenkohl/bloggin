package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.CategoryFresh;
import de.ottorohenkohl.bloggin.menu.object.SectionFresh;
import de.ottorohenkohl.bloggin.reference.ReferenceFreshMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, ItemFreshMapper.class, SectionFreshMapper.class, TypeMapper.class, NameMapper.class})
@Getter
public abstract class CategoryFreshMapper implements UnaryMapper<Category, CategoryFresh> {
    
    @Inject
    SectionRepository repository;
}