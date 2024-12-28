package de.ottorohenkohl.bloggin.domain.menu;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.menu.object.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class MenuService {
    
    private final CategoryExistingMapper categoryExistingMapper;
    private final CategoryFreshMapper categoryFreshMapper;
    private final ItemExistingMapper itemExistingMapper;
    private final ItemFreshMapper itemFreshMapper;
    private final MenuExistingMapper menuExistingMapper;
    private final MenuFreshMapper menuFreshMapper;
    private final SectionExistingMapper sectionExistingMapper;
    private final SectionFreshMapper sectionFreshMapper;
    
    private final CategoryRepository categoryRepository;
    private final ItemRepository itemRepository;
    private final MenuRepository menuRepository;
    private final SectionRepository sectionRepository;
    
    @Transactional
    public MenuExisting findExistingMenu(String identifier) {
        return menuExistingMapper.export(menuRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public List<MenuExisting> findExistingMenus(Page page) {
        return menuRepository.read(page).stream().map(menuExistingMapper::export).toList();
    }
    
    @Transactional
    public MenuExisting removeExistingMenu(String identifier) {
        return menuExistingMapper.export(menuRepository.delete(menuRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public MenuExisting storeFreshMenu(MenuFresh freshMenu) {
        return menuExistingMapper.export(menuFreshMapper.parse(freshMenu));
    }
    
    @Transactional
    public MenuExisting storeFreshCategoryInMenu(String identifier, CategoryFresh categoryFresh) {
        var menu = menuRepository.read(new Identifier(identifier));
        
        menu.getCategories().add(categoryFreshMapper.parse(categoryFresh));
        
        return menuExistingMapper.export(menu);
    }
    
    @Transactional
    public CategoryExisting removeCategory(String identifier) {
        return categoryExistingMapper.export(categoryRepository.delete(categoryRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public CategoryExisting storeFreshSectionInCategory(String identifier, SectionFresh sectionFresh) {
        var category = categoryRepository.read(new Identifier(identifier));
        
        category.getSections().add(sectionFreshMapper.parse(sectionFresh));
        
        return categoryExistingMapper.export(category);
    }
    
    @Transactional
    public SectionExisting removeSection(String identifier) {
        return sectionExistingMapper.export(sectionRepository.delete(sectionRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public SectionExisting storeFreshItemInSection(String identifier, ItemFresh itemFresh) {
        var section = sectionRepository.read(new Identifier(identifier));
        
        section.getItems().add(itemFreshMapper.parse(itemFresh));
        
        return sectionExistingMapper.export(section);
    }
    
    @Transactional
    public ItemExisting removeItem(String identifier) {
        return itemExistingMapper.export(itemRepository.delete(itemRepository.read(new Identifier(identifier))));
    }
}
