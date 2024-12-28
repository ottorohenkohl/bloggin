package de.ottorohenkohl.bloggin.domain.person.object;

public record RoleExisting(
        String identifier,
        String scope,
        String type
) {}