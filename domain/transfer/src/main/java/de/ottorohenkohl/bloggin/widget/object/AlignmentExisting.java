package de.ottorohenkohl.bloggin.widget.object;

public record AlignmentExisting(
        WidgetExisting child,
        String direction,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}