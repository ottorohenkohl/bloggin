package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.reference.object.ExternalExisting;
import de.ottorohenkohl.bloggin.reference.value.UrlMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, UrlMapper.class})
@Getter
public abstract class ExternalExistingMapper implements BinaryMapper<External, ExternalExisting> {
    
    @Inject
    ExternalRepository repository;
}