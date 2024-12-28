package de.ottorohenkohl.bloggin.domain.config.object;

import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;
import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;

public record ConfigExisting(
        String copyright,
        String description,
        FileExisting favicon,
        SiteExisting home,
        String identifier,
        String name,
        String type
) {}