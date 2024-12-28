package de.ottorohenkohl.bloggin.widget.object;

public record ExpansionExisting(
        WidgetExisting child,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}