package de.ottorohenkohl.bloggin.domain.core;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import jakarta.persistence.EntityManager;

public interface Repository<T extends Identifiable> {
    
    EntityManager getEntityManager();
    
    T read(Identifier identifier);
    
    default T create(T individual) {
        getEntityManager().persist(individual);
        
        return individual;
    }
    
    default T delete(T individual) {
        getEntityManager().remove(individual);
        
        return individual;
    }
}
