package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ParagraphRepository extends Repository<Paragraph> {
    
    @Find
    Paragraph read(Identifier identifier);
}
