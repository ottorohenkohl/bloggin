package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.query.Page;

import java.util.List;

interface PersonRepository extends Repository<Person> {
    
    @Find
    Person read(Identifier identifier);
    
    @Find
    List<Person> read(Page page);
}