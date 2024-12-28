package de.ottorohenkohl.bloggin.page;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface PageRepository extends Repository<Page> {
    
    @Find
    Page read(Identifier identifier);
}
