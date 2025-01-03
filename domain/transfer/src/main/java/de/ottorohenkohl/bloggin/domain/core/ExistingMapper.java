package de.ottorohenkohl.bloggin.domain.core;

import org.mapstruct.AfterMapping;
import org.mapstruct.Named;

public abstract class ExistingMapper<I extends Identifiable, O> implements FunctionalMapper<I, O>, MergingMapper<I> {
    
    public abstract Repository<I> getRepository();
    
    @AfterMapping @Named("binary")
    protected I store(I identifiable) {
        return merge(identifiable, getRepository().read(identifiable.getIdentifier()));
    }
}