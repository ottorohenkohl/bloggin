package de.ottorohenkohl.bloggin.page.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public record Title(@NotBlank @Size(min = 4, max = 24) String value) {}