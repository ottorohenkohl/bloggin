package de.ottorohenkohl.bloggin.domain.widget.object;

public record SeparatorFresh(
        String direction,
        WidgetFresh successor,
        String type
) implements WidgetFresh {}