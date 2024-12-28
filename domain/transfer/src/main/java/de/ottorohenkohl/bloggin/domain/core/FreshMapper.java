package de.ottorohenkohl.bloggin.domain.core;

import org.mapstruct.AfterMapping;
import org.mapstruct.Named;

public abstract class FreshMapper<I extends Identifiable, O> implements ConsumingMapper<I, O> {
    
    public abstract Repository<I> getRepository();
    
    @AfterMapping @Named("consuming")
    protected I store(I identifiable) {
        return getRepository().create(identifiable);
    }
}