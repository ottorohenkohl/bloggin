package de.ottorohenkohl.bloggin.domain.file;

import de.ottorohenkohl.bloggin.domain.core.ExistingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;
import de.ottorohenkohl.bloggin.domain.file.value.DataMapper;
import de.ottorohenkohl.bloggin.domain.file.value.MimetypeMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {DataMapper.class, IdentifierMapper.class, MimetypeMapper.class, TypeMapper.class})
@Getter
public abstract class FileExistingMapper extends ExistingMapper<File, FileExisting> {
    
    @Inject
    FileRepository repository;
}