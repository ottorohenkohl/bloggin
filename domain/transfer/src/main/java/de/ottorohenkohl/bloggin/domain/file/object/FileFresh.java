package de.ottorohenkohl.bloggin.domain.file.object;

public record FileFresh(
        Byte[] data,
        String mimetype
) {}