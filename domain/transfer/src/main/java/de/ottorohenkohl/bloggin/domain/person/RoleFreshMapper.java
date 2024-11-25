package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.FreshMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.person.object.RoleFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {PersonExistingMapper.class, TypeMapper.class})
@Getter
public abstract class RoleFreshMapper extends FreshMapper<Role, RoleFresh> {
    
    @Inject
    RoleRepository repository;
}