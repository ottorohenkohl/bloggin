package de.ottorohenkohl.bloggin.domain.config;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

interface ConfigRepository extends Repository<Config> {
    
    @Find
    Config read(Identifier identifier);
    
    default Config read() {
        var criteriaBuilder = getEntityManager().getCriteriaBuilder();
        var criteriaQuery = criteriaBuilder.createQuery(Config.class);
        var from = criteriaQuery.from(Config.class);
        
        criteriaQuery.select(from);
        
        return getEntityManager().createQuery(criteriaQuery).getSingleResult();
    }
}