package de.ottorohenkohl.bloggin.core;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface MergeMapper<I extends Identifiable> {
    
    @BeanMapping(qualifiedByName = "merge", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    I merge(I identifiable, @MappingTarget I target);
}