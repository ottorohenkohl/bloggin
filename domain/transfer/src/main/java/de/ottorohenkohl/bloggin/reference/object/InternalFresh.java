package de.ottorohenkohl.bloggin.reference.object;

import de.ottorohenkohl.bloggin.page.object.PageExisting;

public record InternalFresh(
        PageExisting target,
        String type
) implements ReferenceFresh {}