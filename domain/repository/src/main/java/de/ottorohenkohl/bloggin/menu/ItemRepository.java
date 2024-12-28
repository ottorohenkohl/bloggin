package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

public interface ItemRepository extends Repository<Item> {
    
    @Find
    Item read(Identifier identifier);
}
