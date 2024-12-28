package de.ottorohenkohl.bloggin.widget.object;

public record HeaderExisting(
        String identifier,
        String level,
        WidgetExisting successor,
        String text,
        String type
) implements WidgetExisting {}
