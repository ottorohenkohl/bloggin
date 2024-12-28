package de.ottorohenkohl.bloggin.domain.reference.object;

import de.ottorohenkohl.bloggin.domain.site.object.SiteExisting;

public record InternalExisting(
        String identifier,
        SiteExisting target,
        String type
) implements ReferenceExisting {}