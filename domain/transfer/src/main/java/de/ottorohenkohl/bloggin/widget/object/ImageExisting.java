package de.ottorohenkohl.bloggin.widget.object;

import de.ottorohenkohl.bloggin.file.object.FileExisting;

public record ImageExisting(
        FileExisting file,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}
