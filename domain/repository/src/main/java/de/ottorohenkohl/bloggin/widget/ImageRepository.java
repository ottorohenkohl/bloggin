package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ImageRepository extends Repository<Image> {
    
    @Find
    Image read(Identifier identifier);
}
