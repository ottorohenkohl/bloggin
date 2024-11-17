package de.ottorohenkohl.bloggin.domain.core.value;

import org.mapstruct.Mapper;

@Mapper
public interface IdentifierMapper {
    
    default Identifier map(String identifier) {
        return new Identifier(identifier);
    }
    
    default String map(Identifier identifier) {
        return identifier.value();
    }
}
