package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.value.Identifier;
import de.ottorohenkohl.bloggin.reference.object.InternalExisting;
import de.ottorohenkohl.bloggin.reference.object.ReferenceExisting;
import de.ottorohenkohl.bloggin.reference.object.ReferenceFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class ReferenceService {
    
    private final InternalExistingMapper internalExistingMapper;
    private final InternalRepository internalRepository;
    private final ReferenceExistingMapper referenceExistingMapper;
    private final ReferenceFreshMapper referenceFreshMapper;
    private final ReferenceRepository referenceRepository;
    
    @Transactional
    public List<InternalExisting> findExistingInternalsWithoutTarget() {
        return internalRepository.all(null).stream().map(internalExistingMapper::export).toList();
    }
    
    @Transactional
    public ReferenceExisting findExistingReference(String identifier) {
        return referenceExistingMapper.export(referenceRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public ReferenceExisting removeExistingReference(String identifier) {
        return referenceExistingMapper.export(referenceRepository.delete(referenceRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public ReferenceExisting storeFreshReference(ReferenceFresh freshReference) {
        return referenceExistingMapper.export(referenceFreshMapper.parse(freshReference));
    }
}