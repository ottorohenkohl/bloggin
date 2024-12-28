package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.query.Page;

import java.awt.print.Pageable;
import java.util.List;

interface ReferenceRepository extends Repository<Reference> {
    
    @Find
    Reference read(Identifier identifier);
    
    @Find
    List<Reference> read(Page page);
}
