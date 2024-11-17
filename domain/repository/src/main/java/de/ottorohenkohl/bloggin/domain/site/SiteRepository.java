package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.query.Page;

import java.util.List;

interface SiteRepository extends Repository<Site> {
    
    @Find
    Site read(Identifier identifier);
    
    @Find
    List<Site> read(Page page);
}
