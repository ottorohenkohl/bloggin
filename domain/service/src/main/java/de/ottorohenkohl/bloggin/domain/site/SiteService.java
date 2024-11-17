package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;
import de.ottorohenkohl.bloggin.domain.site.object.SiteFresh;
import de.ottorohenkohl.bloggin.domain.site.object.SiteInfo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class SiteService {
    
    private final SiteExistingMapper siteExistingMapper;
    private final SiteFreshMapper siteFreshMapper;
    private final SiteInfoMapper siteInfoMapper;
    
    private final SiteRepository siteRepository;
    
    @Transactional
    public SiteExisting changeExistingSite(SiteExisting siteExisting) {
        return siteExistingMapper.export(siteExistingMapper.parse(siteExisting));
    }
    
    @Transactional
    public SiteExisting findExistingSite(String identifier) {
        return siteExistingMapper.export(siteRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public List<SiteInfo> findExistingSites(Page page) {
        return siteRepository.read(page).stream().map(siteInfoMapper::export).toList();
    }
    
    @Transactional
    public SiteExisting removeExistingSite(String identifier) {
        return siteExistingMapper.export(siteRepository.delete(siteRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public SiteExisting storeFreshSite(SiteFresh siteFresh) {
        return siteExistingMapper.export(siteFreshMapper.parse(siteFresh));
    }
}