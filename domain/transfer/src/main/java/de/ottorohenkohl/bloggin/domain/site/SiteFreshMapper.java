package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.domain.site.object.SiteFresh;
import de.ottorohenkohl.bloggin.domain.site.value.TitleMapper;
import de.ottorohenkohl.bloggin.domain.widget.WidgetFreshMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TitleMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class SiteFreshMapper implements ConsumingMapper<Site, SiteFresh> {
    
    @Inject
    SiteRepository repository;
}