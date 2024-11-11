package de.ottorohenkohl.bloggin.widget.object;

public record AlignmentFresh(
        WidgetFresh child,
        String direction,
        WidgetFresh successor,
        String type
) implements WidgetFresh {}