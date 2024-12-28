package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.reference.object.ExternalExisting;
import de.ottorohenkohl.bloggin.reference.object.InternalExisting;
import de.ottorohenkohl.bloggin.reference.object.ReferenceExisting;
import de.ottorohenkohl.bloggin.widget.*;
import de.ottorohenkohl.bloggin.widget.object.*;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class ReferenceExistingMapper implements BinaryMapper<Reference, ReferenceExisting> {
    
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