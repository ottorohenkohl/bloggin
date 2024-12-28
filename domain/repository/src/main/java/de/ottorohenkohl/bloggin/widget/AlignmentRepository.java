package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface AlignmentRepository extends Repository<Alignment> {
    
    @Find
    Alignment read(Identifier identifier);
}