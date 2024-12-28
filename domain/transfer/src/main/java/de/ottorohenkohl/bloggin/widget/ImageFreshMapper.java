package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.UnaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.widget.object.ImageFresh;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {TypeMapper.class, IdentifierMapper.class, WidgetFreshMapper.class})
@Getter
public abstract class ImageFreshMapper implements UnaryMapper<Image, ImageFresh> {
    
    @Inject
    ImageRepository repository;
}
