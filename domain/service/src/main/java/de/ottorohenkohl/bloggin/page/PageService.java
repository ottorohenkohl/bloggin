package de.ottorohenkohl.bloggin.page;

import de.ottorohenkohl.bloggin.core.value.Identifier;
import de.ottorohenkohl.bloggin.page.object.PageExisting;
import de.ottorohenkohl.bloggin.page.object.PageFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class PageService {
    
    private final PageExistingMapper pageExistingMapper;
    private final PageFreshMapper pageFreshMapper;
    
    private final PageRepository pageRepository;
    
    @Transactional
    public PageExisting changeExistingPage(PageExisting pageExisting) {
        return pageExistingMapper.export(pageExistingMapper.parse(pageExisting));
    }
    
    @Transactional
    public PageExisting findExistingPage(String identifier) {
        return pageExistingMapper.export(pageRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public PageExisting removeExistingPage(String identifier) {
        return pageExistingMapper.export(pageRepository.delete(pageRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public PageExisting storeFreshPage(PageFresh pageFresh) {
        return pageExistingMapper.export(pageFreshMapper.parse(pageFresh));
    }
}