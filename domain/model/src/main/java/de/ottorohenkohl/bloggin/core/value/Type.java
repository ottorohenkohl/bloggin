package de.ottorohenkohl.bloggin.core.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public record Type(@NotNull Class<?> value) {}