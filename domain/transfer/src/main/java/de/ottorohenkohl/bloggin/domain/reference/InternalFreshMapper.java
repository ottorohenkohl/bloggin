package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.site.SiteExistingMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.InternalFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, SiteExistingMapper.class})
@Getter
public abstract class InternalFreshMapper implements ConsumingMapper<Internal, InternalFresh> {
    
    @Inject
    InternalRepository repository;
}