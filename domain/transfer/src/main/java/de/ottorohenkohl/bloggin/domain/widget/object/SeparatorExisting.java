package de.ottorohenkohl.bloggin.domain.widget.object;

public record SeparatorExisting(
        String direction,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}
