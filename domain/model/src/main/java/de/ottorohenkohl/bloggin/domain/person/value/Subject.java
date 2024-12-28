package de.ottorohenkohl.bloggin.domain.person.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public record Subject(@NotBlank String value) {}