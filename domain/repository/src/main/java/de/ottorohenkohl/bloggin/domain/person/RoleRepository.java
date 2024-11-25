package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.person.constant.Scope;
import jakarta.persistence.NoResultException;
import org.hibernate.annotations.processing.Find;

import java.util.List;

interface RoleRepository extends Repository<Role> {
    
    @Find
    Role read(Identifier identifier);
    
    @Override
    default Role create(Role individual) {
        try {
            return read(individual.getPerson(), individual.getScope());
        } catch (NoResultException e) {
            getEntityManager().persist(individual);
        }
        
        return individual;
    }
    
    @Find
    Role read(Person person, Scope scope);
    
    @Find
    List<Role> read(Person person);
}