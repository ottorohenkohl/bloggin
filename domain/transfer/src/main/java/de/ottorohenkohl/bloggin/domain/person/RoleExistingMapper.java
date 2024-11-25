package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.person.object.RoleExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class})
@Getter
public abstract class RoleExistingMapper extends ExistingMapper<Role, RoleExisting> {
    
    @Inject
    RoleRepository repository;
}