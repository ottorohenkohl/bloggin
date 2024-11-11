package de.ottorohenkohl.bloggin.core.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public record Description(@NotBlank @Size(min = 2, max = 64) String value) {}