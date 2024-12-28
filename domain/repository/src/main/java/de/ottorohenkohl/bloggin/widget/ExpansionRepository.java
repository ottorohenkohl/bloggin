package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ExpansionRepository extends Repository<Expansion> {
    
    @Find
    Expansion read(Identifier identifier);
}
