package de.ottorohenkohl.bloggin.domain.file.value;

import org.mapstruct.Mapper;

@Mapper
public interface DataMapper {
    
    default Byte[] map(Data data) {
        return data.value();
    }
    
    default Data map(Byte[] value) {
        return new Data(value);
    }
}
