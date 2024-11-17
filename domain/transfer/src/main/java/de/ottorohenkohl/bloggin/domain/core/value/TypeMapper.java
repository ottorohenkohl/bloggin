package de.ottorohenkohl.bloggin.domain.core.value;

import org.mapstruct.Mapper;

@Mapper
public interface TypeMapper {
    
    default Type map(String type) throws ClassNotFoundException {
        return new Type(Class.forName(type));
    }
    
    default String map(Type type) {
        return type.value().getName();
    }
}