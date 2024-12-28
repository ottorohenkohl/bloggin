package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.FunctionalMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.domain.widget.object.ImageExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, FileExistingMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class ImageExistingMapper implements FunctionalMapper<Image, ImageExisting> {
    
    @Inject
    ImageRepository repository;
}
