package de.ottorohenkohl.bloggin.domain.file.value;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Pattern;

@Embeddable
public record Mimetype(@Pattern(regexp = "[\\w+]+/[\\w+-]+") String value) {}