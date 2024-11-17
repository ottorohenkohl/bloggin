package de.ottorohenkohl.bloggin.domain.file;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.query.Order;
import org.hibernate.query.Page;

import java.util.List;

interface FileRepository extends Repository<File> {
    
    @Find
    File read(Identifier identifier);
    
    @Find
    List<File> read(Page page);
}