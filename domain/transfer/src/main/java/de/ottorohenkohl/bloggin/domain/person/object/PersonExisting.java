package de.ottorohenkohl.bloggin.domain.person.object;

import de.ottorohenkohl.bloggin.domain.file.object.FileExisting;

public record PersonExisting(
        FileExisting fileExisting,
        String identifier,
        String nickname,
        String username,
        String type
) {}