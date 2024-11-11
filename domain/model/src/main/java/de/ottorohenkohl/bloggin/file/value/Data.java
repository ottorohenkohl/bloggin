package de.ottorohenkohl.bloggin.file.value;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotEmpty;

@Embeddable
public record Data(@NotEmpty @Lob Byte[] value) {}