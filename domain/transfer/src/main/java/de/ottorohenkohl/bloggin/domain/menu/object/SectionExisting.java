package de.ottorohenkohl.bloggin.domain.menu.object;

import java.util.List;

public record SectionExisting(
        String identifier,
        List<ItemExisting> items,
        String name,
        String type
) {}