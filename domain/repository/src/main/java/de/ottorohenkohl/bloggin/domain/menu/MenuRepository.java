package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.query.Page;

import java.util.List;

public interface MenuRepository extends Repository<Menu> {
    
    @Find
    Menu read(Identifier identifier);
    
    @Find
    List<Menu> read(Page page);
}
