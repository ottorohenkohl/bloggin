package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.page.PageExistingMapper;
import de.ottorohenkohl.bloggin.reference.object.InternalFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, PageExistingMapper.class})
@Getter
public abstract class InternalFreshMapper implements UnaryMapper<Internal, InternalFresh> {
    
    @Inject
    InternalRepository repository;
}