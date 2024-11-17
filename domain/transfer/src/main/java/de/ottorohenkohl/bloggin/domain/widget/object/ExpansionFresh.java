package de.ottorohenkohl.bloggin.domain.widget.object;

public record ExpansionFresh(
        WidgetFresh child,
        WidgetFresh successor,
        String type
) implements WidgetFresh {}