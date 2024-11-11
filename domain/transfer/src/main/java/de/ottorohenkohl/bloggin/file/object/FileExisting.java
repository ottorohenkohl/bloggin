package de.ottorohenkohl.bloggin.file.object;

public record FileExisting(
        Byte[] data,
        String identifier,
        String mimetype,
        String type
) {}