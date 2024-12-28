package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.page.PageExistingMapper;
import de.ottorohenkohl.bloggin.reference.object.InternalExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, PageExistingMapper.class, TypeMapper.class,})
@Getter
public abstract class InternalExistingMapper implements BinaryMapper<Internal, InternalExisting> {
    
    @Inject
    InternalRepository repository;
}