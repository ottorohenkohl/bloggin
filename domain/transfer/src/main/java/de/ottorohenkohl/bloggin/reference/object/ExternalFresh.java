package de.ottorohenkohl.bloggin.reference.object;

public record ExternalFresh(
        String type,
        String url
) implements ReferenceFresh {}