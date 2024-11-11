package de.ottorohenkohl.bloggin.reference.object;

import de.ottorohenkohl.bloggin.page.object.PageExisting;

public record InternalExisting(
        String identifier,
        PageExisting target,
        String type
) implements ReferenceExisting {}