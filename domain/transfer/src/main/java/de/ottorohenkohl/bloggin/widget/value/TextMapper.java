package de.ottorohenkohl.bloggin.widget.value;

import org.mapstruct.Mapper;

@Mapper
public interface TextMapper {
    
    default String map(Text text) {
        return text.value();
    }
    
    default Text map(String value) {
        return new Text(value);
    }
}
