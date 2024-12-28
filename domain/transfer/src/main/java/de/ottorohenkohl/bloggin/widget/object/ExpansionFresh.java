package de.ottorohenkohl.bloggin.widget.object;

public record ExpansionFresh(
        WidgetFresh child,
        WidgetFresh successor,
        String type
) implements WidgetFresh {}