package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ReferenceRepository extends Repository<Reference> {
    
    @Find
    Reference read(Identifier identifier);
}
