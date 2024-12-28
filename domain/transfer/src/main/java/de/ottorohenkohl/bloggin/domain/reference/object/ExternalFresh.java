package de.ottorohenkohl.bloggin.domain.reference.object;

public record ExternalFresh(
        String type,
        String url
) implements ReferenceFresh {}