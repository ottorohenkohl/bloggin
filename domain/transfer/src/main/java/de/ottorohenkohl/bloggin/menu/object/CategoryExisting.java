package de.ottorohenkohl.bloggin.menu.object;

import java.util.List;

public record CategoryExisting(
        String identifier,
        List<ItemExisting> items,
        String name,
        List<SectionExisting> sections
) {}