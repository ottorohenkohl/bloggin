package de.ottorohenkohl.bloggin.config.object;

import de.ottorohenkohl.bloggin.file.object.FileExisting;
import de.ottorohenkohl.bloggin.page.object.PageExisting;

public record ConfigExisting(
        String copyright,
        String description,
        FileExisting favicon,
        PageExisting home,
        String identifier,
        String name,
        String type
) {}