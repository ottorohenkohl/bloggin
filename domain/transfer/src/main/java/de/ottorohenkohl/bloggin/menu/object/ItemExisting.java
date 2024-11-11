package de.ottorohenkohl.bloggin.menu.object;

import de.ottorohenkohl.bloggin.reference.object.ReferenceExisting;

public record ItemExisting(
        String icon,
        String identifier,
        String name,
        ReferenceExisting reference,
        String type
) {}