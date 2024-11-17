package de.ottorohenkohl.bloggin.domain.widget.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public record Text(@NotBlank @Size(min = 4, max = 10240) String value) {}