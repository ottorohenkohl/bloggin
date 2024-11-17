package de.ottorohenkohl.bloggin.domain.widget.object;

public record HeaderFresh(
        String level,
        WidgetFresh successor,
        String text,
        String type
) implements WidgetFresh {}