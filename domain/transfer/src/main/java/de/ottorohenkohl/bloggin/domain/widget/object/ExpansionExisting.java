package de.ottorohenkohl.bloggin.domain.widget.object;

public record ExpansionExisting(
        WidgetExisting child,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}