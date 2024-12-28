package de.ottorohenkohl.bloggin.domain.file;

import de.ottorohenkohl.bloggin.domain.core.ConsumingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.object.FileFresh;
import de.ottorohenkohl.bloggin.domain.file.value.DataMapper;
import de.ottorohenkohl.bloggin.domain.file.value.MimetypeMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {DataMapper.class, IdentifierMapper.class, MimetypeMapper.class, TypeMapper.class})
@Getter
public abstract class FileFreshMapper implements ConsumingMapper<File, FileFresh> {
    
    @Inject
    FileRepository fileRepository;
}