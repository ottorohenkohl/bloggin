package de.ottorohenkohl.bloggin.widget.object;

public record SeparatorFresh(
        String direction,
        WidgetFresh successor,
        String type
) implements WidgetFresh {}