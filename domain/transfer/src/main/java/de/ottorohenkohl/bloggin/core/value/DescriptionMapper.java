package de.ottorohenkohl.bloggin.core.value;

import org.mapstruct.Mapper;

@Mapper
public interface DescriptionMapper {
    
    default Description map(String description) {
        return new Description(description);
    }
    
    default String map(Description description) {
        return description.value();
    }
}
