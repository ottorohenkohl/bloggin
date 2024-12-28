package de.ottorohenkohl.bloggin.menu.object;

import java.util.List;

public record MenuFresh(
        List<CategoryFresh> categories,
        String identifier,
        List<ItemFresh> items,
        String name
) {}