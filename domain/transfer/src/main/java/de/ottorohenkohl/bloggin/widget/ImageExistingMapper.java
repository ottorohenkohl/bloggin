package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.core.BinaryMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.file.FileExistingMapper;
import de.ottorohenkohl.bloggin.widget.object.ImageExisting;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, FileExistingMapper.class, TypeMapper.class, WidgetExistingMapper.class})
@Getter
public abstract class ImageExistingMapper implements BinaryMapper<Image, ImageExisting> {
    
    @Inject
    ImageRepository repository;
}
