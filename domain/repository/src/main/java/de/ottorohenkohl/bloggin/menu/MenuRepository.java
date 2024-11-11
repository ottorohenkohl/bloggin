package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

public interface MenuRepository extends Repository<Menu> {
    
    @Find
    Menu read(Identifier identifier);
}
