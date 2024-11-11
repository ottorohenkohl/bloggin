package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

public interface CategoryRepository extends Repository<Category> {
    
    @Find
    Category read(Identifier identifier);
}
