package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.ExternalExisting;
import de.ottorohenkohl.bloggin.domain.reference.value.UrlMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, UrlMapper.class})
@Getter
public abstract class ExternalExistingMapper implements FunctionalMapper<External, ExternalExisting> {
    
    @Inject
    ExternalRepository repository;
}