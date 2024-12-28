package de.ottorohenkohl.bloggin.widget.object;

public record ParagraphFresh(
        String size,
        WidgetFresh successor,
        String text,
        String type
) implements WidgetFresh {}