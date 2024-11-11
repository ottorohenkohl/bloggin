package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface SeparatorRepository extends Repository<Separator> {
    
    @Find
    Separator read(Identifier identifier);
}
