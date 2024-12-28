package de.ottorohenkohl.bloggin.domain.file;

import de.ottorohenkohl.bloggin.domain.core.ProducingMapper;
import de.ottorohenkohl.bloggin.domain.core.value.IdentifierMapper;
import de.ottorohenkohl.bloggin.domain.core.value.TypeMapper;
import de.ottorohenkohl.bloggin.domain.file.object.FileInfo;
import de.ottorohenkohl.bloggin.domain.file.value.MimetypeMapper;
import jakarta.inject.Inject;
import lombok.Getter;
import org.mapstruct.Mapper;

@Mapper(uses = {IdentifierMapper.class, MimetypeMapper.class, TypeMapper.class})
@Getter
public abstract class FileInfoMapper implements ProducingMapper<File, FileInfo> {
    
    @Inject
    FileRepository fileRepository;
}