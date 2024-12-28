package de.ottorohenkohl.bloggin.domain.file.object;

public record FileExisting(
        Byte[] data,
        String identifier,
        String mimetype,
        String type
) {}