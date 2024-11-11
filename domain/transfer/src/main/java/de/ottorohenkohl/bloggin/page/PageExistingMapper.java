package de.ottorohenkohl.bloggin.page;

import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.page.object.PageExisting;
import de.ottorohenkohl.bloggin.page.value.TitleMapper;
import de.ottorohenkohl.bloggin.widget.WidgetExistingMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, TypeMapper.class, TitleMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class PageExistingMapper extends ExistingMapper<Page, PageExisting> {
    
    @Inject
    PageRepository repository;
}