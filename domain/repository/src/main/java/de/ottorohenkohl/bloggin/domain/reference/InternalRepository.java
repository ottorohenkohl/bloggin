package de.ottorohenkohl.bloggin.domain.reference;

import de.ottorohenkohl.bloggin.domain.core.Repository;
import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import org.hibernate.annotations.processing.Find;

import java.util.List;

interface InternalRepository extends Repository<Internal> {
    
    @Find
    Internal read(Identifier identifier);
    
    default List<Internal> readBlank() {
        var criteriaBuilder = getEntityManager().getCriteriaBuilder();
        var criteriaQuery = criteriaBuilder.createQuery(Internal.class);
        var root = criteriaQuery.from(Internal.class);
        
        criteriaQuery.select(root).where(criteriaBuilder.equal(null, Internal_.target));
        
        return getEntityManager().createQuery(criteriaQuery).getResultList();
    }
}
