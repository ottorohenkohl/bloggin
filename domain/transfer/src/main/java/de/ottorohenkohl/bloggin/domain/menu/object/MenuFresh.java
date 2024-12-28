package de.ottorohenkohl.bloggin.domain.menu.object;

import java.util.List;

public record MenuFresh(
        List<CategoryFresh> categories,
        String identifier,
        List<ItemFresh> items,
        String name
) {}