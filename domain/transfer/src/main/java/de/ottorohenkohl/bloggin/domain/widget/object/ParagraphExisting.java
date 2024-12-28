package de.ottorohenkohl.bloggin.domain.widget.object;

public record ParagraphExisting(
        String identifier,
        String size,
        WidgetExisting successor,
        String text,
        String type
) implements WidgetExisting {}