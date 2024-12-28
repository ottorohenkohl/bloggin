package de.ottorohenkohl.bloggin.domain.file;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.file.constant.Visibility;
import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;
import de.ottorohenkohl.bloggin.domain.file.object.FileFresh;
import de.ottorohenkohl.bloggin.domain.file.object.FileInfo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class FileService {
    
    private final FileExistingMapper fileExistingMapper;
    private final FileFreshMapper fileFreshMapper;
    private final FileInfoMapper fileInfoMapper;
    
    private final FileRepository fileRepository;
    
    @Transactional
    public FileExisting findExistingFile(String identifier) {
        return fileExistingMapper.export(fileRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public List<FileInfo> findExistingFiles(Page page) {
        return fileRepository.read(page, Visibility.PUBLIC).stream().map(fileInfoMapper::export).toList();
    }
    
    @Transactional
    public FileExisting removeExistingFile(String identifier) {
        return fileExistingMapper.export(fileRepository.delete(fileRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public FileExisting storeFreshFile(FileFresh freshFile) {
        return fileExistingMapper.export(fileRepository.create(fileFreshMapper.parse(freshFile)));
    }
}