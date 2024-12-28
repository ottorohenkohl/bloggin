package de.ottorohenkohl.bloggin.domain.reference.object;

public record ExternalExisting(
        String identifier,
        String type,
        String url
) implements ReferenceExisting {}