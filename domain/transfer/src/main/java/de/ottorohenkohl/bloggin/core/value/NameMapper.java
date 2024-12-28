package de.ottorohenkohl.bloggin.core.value;

import org.mapstruct.Mapper;

@Mapper
public interface NameMapper {
    
    default Name map(String name) {
        return new Name(name);
    }
    
    default String map(Name name) {
        return name.value();
    }
}
