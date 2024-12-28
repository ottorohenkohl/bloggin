package de.ottorohenkohl.bloggin.domain.core;

import org.mapstruct.BeanMapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface FunctionalMapper<I extends Identifiable, O> {
    
    @BeanMapping(qualifiedByName = "binary", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    O export(I identifiable);
    
    @BeanMapping(qualifiedByName = "binary", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    I parse(O object);
}