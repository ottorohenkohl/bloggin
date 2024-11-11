package de.ottorohenkohl.bloggin.menu.object;

import de.ottorohenkohl.bloggin.reference.object.ReferenceFresh;

public record ItemFresh(
        String icon,
        String name,
        ReferenceFresh reference
) {}