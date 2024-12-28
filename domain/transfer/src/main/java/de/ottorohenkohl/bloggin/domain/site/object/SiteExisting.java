package de.ottorohenkohl.bloggin.domain.site.object;

import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetExisting;

public record SiteExisting(
        FileExisting file,
        String identifier,
        String layout,
        WidgetExisting root,
        String title,
        String type
) {}