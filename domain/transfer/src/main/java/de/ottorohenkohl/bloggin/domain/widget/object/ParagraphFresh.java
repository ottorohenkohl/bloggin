package de.ottorohenkohl.bloggin.domain.widget.object;

public record ParagraphFresh(
        String size,
        WidgetFresh successor,
        String text,
        String type
) implements WidgetFresh {}