package de.ottorohenkohl.bloggin.config;

import de.ottorohenkohl.bloggin.config.object.ConfigExisting;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class ConfigService {
    
    private final ConfigExistingMapper configExistingMapper;
    
    private final ConfigRepository configRepository;
    
    @Transactional
    public ConfigExisting changeExistingConfig(ConfigExisting configExisting) {
        return configExistingMapper.export(configExistingMapper.parse(configExisting));
    }
    
    @Transactional
    public ConfigExisting findExistingConfig() {
        return configExistingMapper.export(configRepository.single());
    }
}