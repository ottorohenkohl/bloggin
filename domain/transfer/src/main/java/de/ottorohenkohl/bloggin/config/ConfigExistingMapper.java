package de.ottorohenkohl.bloggin.config;

import de.ottorohenkohl.bloggin.config.object.ConfigExisting;
import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.DescriptionMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.NameMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.menu.CategoryRepository;
import de.ottorohenkohl.bloggin.menu.ItemExistingMapper;
import de.ottorohenkohl.bloggin.menu.Menu;
import de.ottorohenkohl.bloggin.menu.MenuRepository;
import de.ottorohenkohl.bloggin.menu.object.MenuExisting;
import de.ottorohenkohl.bloggin.page.PageExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {DescriptionMapper.class, FileExistingMapper.class, IdentifierMapper.class, NameMapper.class, PageExistingMapper.class, TypeMapper.class})
@Getter
public abstract class ConfigExistingMapper extends ExistingMapper<Config, ConfigExisting> {
    
    @Inject
    ConfigRepository repository;
}