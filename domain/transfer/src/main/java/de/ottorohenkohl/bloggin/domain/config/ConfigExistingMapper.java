package de.ottorohenkohl.bloggin.domain.config;

import de.ottorohenkohl.bloggin.domain.config.object.ConfigExisting;
import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.DescriptionMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.NameMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.domain.site.SiteExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {DescriptionMapper.class, FileExistingMapper.class, IdentifierMapper.class, NameMapper.class, SiteExistingMapper.class, TypeMapper.class})
@Getter
public abstract class ConfigExistingMapper extends ExistingMapper<Config, ConfigExisting> {
    
    @Inject
    ConfigRepository repository;
}