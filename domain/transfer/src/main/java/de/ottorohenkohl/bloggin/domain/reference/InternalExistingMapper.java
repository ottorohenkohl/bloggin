package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.site.SiteExistingMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.InternalExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, SiteExistingMapper.class, TypeMapper.class,})
@Getter
public abstract class InternalExistingMapper implements FunctionalMapper<Internal, InternalExisting> {
    
    @Inject
    InternalRepository repository;
}