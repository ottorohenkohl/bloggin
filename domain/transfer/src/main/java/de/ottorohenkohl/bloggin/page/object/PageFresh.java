package de.ottorohenkohl.bloggin.page.object;

import de.ottorohenkohl.bloggin.file.object.FileExisting;
import de.ottorohenkohl.bloggin.widget.object.WidgetFresh;

public record PageFresh(
        FileExisting background,
        String layout,
        WidgetFresh root,
        String title
) {}