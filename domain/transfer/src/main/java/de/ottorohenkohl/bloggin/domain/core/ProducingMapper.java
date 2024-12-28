package de.ottorohenkohl.bloggin.domain.core;

import org.mapstruct.BeanMapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface ProducingMapper<I extends Identifiable, O> {
    
    @BeanMapping(qualifiedByName = "producing", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    O export(I identifiable);
}