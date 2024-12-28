package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.widget.object.WidgetExisting;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class WidgetVisitor implements Visitor<WidgetExisting> {
    
    private final AlignmentExistingMapper alignmentExistingMapper;
    private final ExpansionExistingMapper expansionExistingMapper;
    private final HeaderExistingMapper headerExistingMapper;
    private final ImageExistingMapper imageExistingMapper;
    private final ParagraphExistingMapper paragraphExistingMapper;
    private final SeparatorExistingMapper separatorExistingMapper;
    
    @Override
    public WidgetExisting visit(Alignment alignment) {
        return alignmentExistingMapper.export(alignment);
    }
    
    @Override
    public WidgetExisting visit(Expansion expansion) {
        return expansionExistingMapper.export(expansion);
    }
    
    @Override
    public WidgetExisting visit(Header header) {
        return headerExistingMapper.export(header);
    }
    
    @Override
    public WidgetExisting visit(Image image) {
        return imageExistingMapper.export(image);
    }
    
    @Override
    public WidgetExisting visit(Paragraph paragraph) {
        return paragraphExistingMapper.export(paragraph);
    }
    
    @Override
    public WidgetExisting visit(Separator separator) {
        return separatorExistingMapper.export(separator);
    }
}
