package de.ottorohenkohl.bloggin.domain.menu.object;

import java.util.List;

public record MenuExisting(
        List<CategoryExisting> categories,
        String identifier,
        List<ItemExisting> items,
        String name
) {}