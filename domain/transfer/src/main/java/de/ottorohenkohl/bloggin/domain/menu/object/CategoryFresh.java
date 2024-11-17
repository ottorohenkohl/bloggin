package de.ottorohenkohl.bloggin.domain.menu.object;

import java.util.List;

public record CategoryFresh(
        List<ItemFresh> items,
        String name,
        List<SectionFresh> sections
) {}