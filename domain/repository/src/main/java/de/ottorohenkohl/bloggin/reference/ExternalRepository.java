package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ExternalRepository extends Repository<External> {
    
    @Find
    External read(Identifier identifier);
}
