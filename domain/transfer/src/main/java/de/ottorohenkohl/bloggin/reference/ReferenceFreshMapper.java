package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.reference.object.ExternalFresh;
import de.ottorohenkohl.bloggin.reference.object.InternalFresh;
import de.ottorohenkohl.bloggin.reference.object.ReferenceFresh;
import de.ottorohenkohl.bloggin.widget.*;
import de.ottorohenkohl.bloggin.widget.object.*;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class ReferenceFreshMapper implements UnaryMapper<Reference, ReferenceFresh> {
    
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