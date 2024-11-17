package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

public interface ItemRepository extends Repository<Item> {
    
    @Find
    Item read(Identifier identifier);
}
