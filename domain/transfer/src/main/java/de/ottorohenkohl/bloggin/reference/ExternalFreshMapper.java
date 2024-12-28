package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.reference.object.ExternalFresh;
import de.ottorohenkohl.bloggin.reference.value.UrlMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TypeMapper.class, IdentifierMapper.class, UrlMapper.class})
@Getter
public abstract class ExternalFreshMapper implements UnaryMapper<External, ExternalFresh> {
    
    @Inject
    ExternalRepository repository;
}