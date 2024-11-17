package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.ProducingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.site.object.SiteInfo;
import de.ottorohenkohl.bloggin.domain.site.value.TitleMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TitleMapper.class, TypeMapper.class})
@Getter
public abstract class SiteInfoMapper implements ProducingMapper<Site, SiteInfo> {
    
    @Inject
    SiteRepository repository;
}