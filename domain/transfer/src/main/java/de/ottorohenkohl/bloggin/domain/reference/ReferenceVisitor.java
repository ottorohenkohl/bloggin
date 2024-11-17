package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceExisting;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class ReferenceVisitor implements Visitor<ReferenceExisting> {
    
    private final ExternalExistingMapper externalExistingMapper;
    private final InternalExistingMapper internalExistingMapper;
    
    @Override
    public ReferenceExisting visit(External external) {
        return externalExistingMapper.export(external);
    }
    
    @Override
    public ReferenceExisting visit(Internal internal) {
        return internalExistingMapper.export(internal);
    }
}
