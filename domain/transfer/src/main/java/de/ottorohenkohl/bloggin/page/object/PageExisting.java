package de.ottorohenkohl.bloggin.page.object;

import de.ottorohenkohl.bloggin.file.object.FileExisting;
import de.ottorohenkohl.bloggin.widget.object.WidgetExisting;

public record PageExisting(
        FileExisting file,
        String identifier,
        String layout,
        WidgetExisting root,
        String title,
        String type
) {}