package de.ottorohenkohl.bloggin.widget.object;

public record ParagraphExisting(
        String identifier,
        String size,
        WidgetExisting successor,
        String text,
        String type
) implements WidgetExisting {}