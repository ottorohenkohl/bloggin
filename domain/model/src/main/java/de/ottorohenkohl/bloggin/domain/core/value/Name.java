package de.ottorohenkohl.bloggin.domain.core.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public record Name(@NotBlank @Size(min = 2, max = 16) String value) {}