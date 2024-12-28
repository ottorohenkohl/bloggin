package de.ottorohenkohl.bloggin.domain.widget.object;

import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;

public record ImageExisting(
        FileExisting file,
        String identifier,
        WidgetExisting successor,
        String type
) implements WidgetExisting {}
