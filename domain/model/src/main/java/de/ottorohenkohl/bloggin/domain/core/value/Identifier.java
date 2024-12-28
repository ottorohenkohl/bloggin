package de.ottorohenkohl.bloggin.domain.core.value;

import jakarta.persistence.Embeddable;
import org.hibernate.validator.constraints.UUID;

@Embeddable
public record Identifier(@UUID String value) {}