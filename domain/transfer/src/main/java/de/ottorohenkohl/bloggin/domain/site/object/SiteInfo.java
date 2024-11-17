package de.ottorohenkohl.bloggin.domain.site.object;

public record SiteInfo(
        String identifier,
        String layout,
        String title,
        String type
) {}