package de.ottorohenkohl.bloggin.domain.person.object;

public record RoleFresh(
        PersonExisting personExisting,
        String scope,
        String type
) {}