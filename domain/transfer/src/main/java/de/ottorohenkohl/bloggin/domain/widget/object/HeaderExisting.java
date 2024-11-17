package de.ottorohenkohl.bloggin.domain.widget.object;

public record HeaderExisting(
        String identifier,
        String level,
        WidgetExisting successor,
        String text,
        String type
) implements WidgetExisting {}
