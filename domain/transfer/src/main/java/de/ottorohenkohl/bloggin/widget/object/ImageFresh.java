package de.ottorohenkohl.bloggin.widget.object;

public record ImageFresh(
        WidgetFresh successor,
        String type
) implements WidgetFresh {}