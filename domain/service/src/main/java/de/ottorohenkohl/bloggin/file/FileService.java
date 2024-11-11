package de.ottorohenkohl.bloggin.file;

import de.ottorohenkohl.bloggin.core.value.Identifier;
import de.ottorohenkohl.bloggin.file.object.FileExisting;
import de.ottorohenkohl.bloggin.file.object.FileFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class FileService {
    
    private final FileExistingMapper fileExistingMapper;
    private final FileFreshMapper fileFreshMapper;
    
    private final FileRepository fileRepository;
    
    @Transactional
    public FileExisting findExistingFile(String identifier) {
        return fileExistingMapper.export(fileRepository.read(new Identifier(identifier)));
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