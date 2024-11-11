package de.ottorohenkohl.bloggin.file.value;

import org.mapstruct.Mapper;

@Mapper
public interface MimetypeMapper {
    
    default Mimetype map(String value) {
        return new Mimetype(value);
    }
    
    default String map(Mimetype mimetype) {
        return mimetype.value();
    }
}
