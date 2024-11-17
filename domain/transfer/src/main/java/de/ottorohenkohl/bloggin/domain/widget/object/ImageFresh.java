package de.ottorohenkohl.bloggin.domain.widget.object;

public record ImageFresh(
        WidgetFresh successor,
        String type
) implements WidgetFresh {}