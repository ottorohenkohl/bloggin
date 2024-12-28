package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;
import de.ottorohenkohl.bloggin.domain.site.value.TitleMapper;
import de.ottorohenkohl.bloggin.domain.widget.WidgetExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, TitleMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class SiteExistingMapper extends ExistingMapper<Site, SiteExisting> {
    
    @Inject
    SiteRepository repository;
}