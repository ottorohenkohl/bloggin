package de.ottorohenkohl.bloggin.file;

import de.ottorohenkohl.bloggin.core.ExistingMapper;
import de.ottorohenkohl.bloggin.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.file.object.FileExisting;
import de.ottorohenkohl.bloggin.file.value.DataMapper;
import de.ottorohenkohl.bloggin.file.value.MimetypeMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {DataMapper.class, IdentifierMapper.class, MimetypeMapper.class, TypeMapper.class})
@Getter
public abstract class FileExistingMapper extends ExistingMapper<File, FileExisting> {
    
    @Inject
    FileRepository repository;
}