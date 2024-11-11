package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import de.ottorohenkohl.bloggin.page.Page;
import org.hibernate.annotations.processing.Find;

import java.util.List;

interface InternalRepository extends Repository<Internal> {
    
    @Find
    Internal read(Identifier identifier);
    
    @Find
    List<Internal> all(Page target);
}
