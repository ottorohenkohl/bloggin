package de.ottorohenkohl.bloggin.domain.core;

import org.mapstruct.BeanMapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface ConsumingMapper<I extends Identifiable, O> {
    
    @BeanMapping(qualifiedByName = "consuming", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    I parse(O object);
}