package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface WidgetRepository extends Repository<Widget> {
    
    @Find
    Widget read(Identifier identifier);
}