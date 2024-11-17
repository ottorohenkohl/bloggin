package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.reference.object.InternalExisting;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceExisting;
import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;

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
        return internalRepository.readBlank().stream().map(internalExistingMapper::export).toList();
    }
    
    @Transactional
    public ReferenceExisting findExistingReference(String identifier) {
        return referenceExistingMapper.export(referenceRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public List<ReferenceExisting> findExistingReferences(Page page) {
        return referenceRepository.read(page).stream().map(referenceExistingMapper::export).toList();
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