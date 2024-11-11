package de.ottorohenkohl.bloggin.menu.object;

import java.util.List;

public record CategoryFresh(
        List<ItemFresh> items,
        String name,
        List<SectionFresh> sections
) {}