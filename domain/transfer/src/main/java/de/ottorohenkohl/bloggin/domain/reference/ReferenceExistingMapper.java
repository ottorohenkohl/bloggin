package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.reference.object.ExternalExisting;
import de.ottorohenkohl.bloggin.domain.reference.object.InternalExisting;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class ReferenceExistingMapper implements FunctionalMapper<Reference, ReferenceExisting> {
    
    @Inject
    ExternalExistingMapper externalExistingMapper;
    @Inject
    InternalExistingMapper internalExistingMapper;
    
    @Inject
    ReferenceVisitor referenceVisitor;
    
    @Override
    public Reference parse(ReferenceExisting referenceExisting) {
        return switch (referenceExisting) {
            case ExternalExisting externalExisting -> externalExistingMapper.parse(externalExisting);
            case InternalExisting internalExisting -> internalExistingMapper.parse(internalExisting);
        };
    }
    
    @Override
    public ReferenceExisting export(Reference reference) {
        return reference.accept(referenceVisitor);
    }
}