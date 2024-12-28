package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetExisting;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetFresh;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class WidgetService {
    
    private final WidgetExistingMapper widgetExistingMapper;
    private final WidgetFreshMapper widgetFreshMapper;
    
    private final WidgetRepository widgetRepository;
    
    @Transactional
    public WidgetExisting changeExistingWidget(WidgetExisting widgetExisting) {
        return widgetExistingMapper.export(widgetExistingMapper.parse(widgetExisting));
    }
    
    @Transactional
    public WidgetExisting findExistingWidget(String identifier) {
        return widgetExistingMapper.export(widgetRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public WidgetExisting removeExistingWidget(String identifier) {
        return widgetExistingMapper.export(widgetRepository.delete(widgetRepository.read(new Identifier(identifier))));
    }
    
    @Transactional
    public WidgetExisting storeFreshWidget(WidgetFresh widgetFresh) {
        return widgetExistingMapper.export(widgetFreshMapper.parse(widgetFresh));
    }
}
