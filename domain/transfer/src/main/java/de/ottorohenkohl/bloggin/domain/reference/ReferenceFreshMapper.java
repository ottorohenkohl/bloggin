package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.ExternalFresh;
import de.ottorohenkohl.bloggin.domain.reference.object.InternalFresh;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class ReferenceFreshMapper implements ConsumingMapper<Reference, ReferenceFresh> {
    
    @Inject
    ExternalFreshMapper externalFreshMapper;
    @Inject
    InternalFreshMapper internalFreshMapper;
    
    @Override
    public Reference parse(ReferenceFresh referenceFresh) {
        return switch (referenceFresh) {
            case ExternalFresh externalFresh -> externalFreshMapper.parse(externalFresh);
            case InternalFresh internalFresh -> internalFreshMapper.parse(internalFresh);
        };
    }
}