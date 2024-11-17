package de.ottorohenkohl.bloggin.domain.menu.object;

import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceFresh;

public record SectionFresh(
        String name,
        ReferenceFresh reference
) {}