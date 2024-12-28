package de.ottorohenkohl.bloggin.reference.value;

import org.mapstruct.Mapper;

@Mapper
public interface UrlMapper {
    
    default Url map(String url) {
        return new Url(url);
    }
    
    default String map(Url url) {
        return url.value();
    }
}
