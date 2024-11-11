package de.ottorohenkohl.bloggin.file.object;

public record FileFresh(
        Byte[] data,
        String mimetype
) {}