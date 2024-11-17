package de.ottorohenkohl.bloggin.domain.site.object;

import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;
import de.ottorohenkohl.bloggin.domain.widget.object.WidgetFresh;

public record SiteFresh(
        FileExisting background,
        String layout,
        WidgetFresh root,
        String title
) {}