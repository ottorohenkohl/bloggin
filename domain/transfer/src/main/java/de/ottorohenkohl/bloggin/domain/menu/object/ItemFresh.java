package de.ottorohenkohl.bloggin.domain.menu.object;

import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;

public record ItemFresh(
        String icon,
        String name,
        ReferenceFresh reference
) {}