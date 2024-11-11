package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.menu.object.ItemFresh;
import de.ottorohenkohl.bloggin.menu.object.SectionFresh;
import de.ottorohenkohl.bloggin.reference.ReferenceExistingMapper;
import de.ottorohenkohl.bloggin.reference.ReferenceFreshMapper;
import de.ottorohenkohl.bloggin.reference.object.ReferenceFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, NameMapper.class, ReferenceFreshMapper.class})
@Getter
public abstract class SectionFreshMapper implements UnaryMapper<Section, SectionFresh> {
    
    @Inject
    SectionRepository repository;
}