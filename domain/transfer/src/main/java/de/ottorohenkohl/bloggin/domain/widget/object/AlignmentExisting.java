package de.ottorohenkohl.bloggin.domain.widget.object;

public record AlignmentExisting(
        WidgetExisting child,
        String direction,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}