package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.FileInfoMapper;
import de.ottorohenkohl.bloggin.domain.person.object.PersonExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, FileInfoMapper.class, NameMapper.class, TypeMapper.class})
@Getter
public abstract class PersonExistingMapper extends ExistingMapper<Person, PersonExisting> {
    
    @Inject
    PersonRepository repository;
}