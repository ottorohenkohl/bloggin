package de.ottorohenkohl.bloggin.core;

import org.mapstruct.BeanMapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface UnaryMapper<I extends Identifiable, O> {
    
    @BeanMapping(qualifiedByName = "unary", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    I parse(O object);
}