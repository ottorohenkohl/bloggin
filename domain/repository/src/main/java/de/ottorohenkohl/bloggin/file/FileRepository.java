package de.ottorohenkohl.bloggin.file;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface FileRepository extends Repository<File> {
    
    @Find
    File read(Identifier identifier);
}