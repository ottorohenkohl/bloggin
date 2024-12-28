package de.ottorohenkohl.bloggin.reference.object;

public record ExternalExisting(
        String identifier,
        String type,
        String url
) implements ReferenceExisting {}