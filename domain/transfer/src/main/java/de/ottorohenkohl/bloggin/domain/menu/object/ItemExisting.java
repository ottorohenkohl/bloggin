package de.ottorohenkohl.bloggin.domain.menu.object;

import de.ottorohenkohl.bloggin.domain.reference.object.ReferenceExisting;

public record ItemExisting(
        String icon,
        String identifier,
        String name,
        ReferenceExisting reference,
        String type
) {}