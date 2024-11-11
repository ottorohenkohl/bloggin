package de.ottorohenkohl.bloggin.widget.object;

public record SeparatorExisting(
        String direction,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}
