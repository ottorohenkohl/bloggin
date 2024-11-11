package de.ottorohenkohl.bloggin.core;

import org.mapstruct.AfterMapping;
import org.mapstruct.Named;

public abstract class FreshMapper<I extends Identifiable, O> implements UnaryMapper<I, O> {
    
    public abstract Repository<I> getRepository();
    
    @AfterMapping @Named("unary")
    protected I store(I identifiable) {
        return getRepository().create(identifiable);
    }
}