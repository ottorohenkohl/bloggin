package de.ottorohenkohl.bloggin.page;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.page.object.PageFresh;
import de.ottorohenkohl.bloggin.page.value.TitleMapper;
import de.ottorohenkohl.bloggin.widget.WidgetFreshMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {FileExistingMapper.class, IdentifierMapper.class, TitleMapper.class, TypeMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class PageFreshMapper implements UnaryMapper<Page, PageFresh> {
    
    @Inject
    PageRepository repository;
}