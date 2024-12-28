package de.ottorohenkohl.bloggin.page.value;

import org.mapstruct.Mapper;

@Mapper
public interface TitleMapper {
    
    default String map(Title title) {
        return title.value();
    }
    
    default Title map(String title) {
        return new Title(title);
    }
}
