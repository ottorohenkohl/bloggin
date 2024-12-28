package de.ottorohenkohl.bloggin.domain.file.object;

public record FileInfo(
        String identifier,
        String mimetype,
        String type
) {}