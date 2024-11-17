package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.ExternalFresh;
import de.ottorohenkohl.bloggin.domain.reference.value.UrlMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TypeMapper.class, IdentifierMapper.class, UrlMapper.class})
@Getter
public abstract class ExternalFreshMapper implements ConsumingMapper<External, ExternalFresh> {
    
    @Inject
    ExternalRepository repository;
}