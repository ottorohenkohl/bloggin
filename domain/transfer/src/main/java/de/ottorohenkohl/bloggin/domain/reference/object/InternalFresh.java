package de.ottorohenkohl.bloggin.domain.reference.object;

import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;

public record InternalFresh(
        SiteExisting target,
        String type
) implements ReferenceFresh {}