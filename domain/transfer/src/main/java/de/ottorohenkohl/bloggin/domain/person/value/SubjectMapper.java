package de.ottorohenkohl.bloggin.domain.person.value;

import org.mapstruct.Mapper;

@Mapper
public interface SubjectMapper {
    
    default String map(Subject subject) {
        return subject.value();
    }
    
    default Subject map(String value) {
        return new Subject(value);
    }
}