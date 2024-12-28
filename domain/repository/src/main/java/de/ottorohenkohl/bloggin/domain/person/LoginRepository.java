package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.person.value.Issuer;
import de.ottorohenkohl.bloggin.domain.person.value.Subject;
import org.hibernate.annotations.processing.Find;

interface LoginRepository extends Repository<Login> {
    
    @Find
    Login read(Identifier identifier);
    
    @Find
    Login read(Issuer issuer, Subject subject);
}