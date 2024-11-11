package de.ottorohenkohl.bloggin.widget.object;

public record HeaderFresh(
        String level,
        WidgetFresh successor,
        String text,
        String type
) implements WidgetFresh {}