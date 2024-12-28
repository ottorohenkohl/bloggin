package de.ottorohenkohl.bloggin.domain.reference.value;

import jakarta.persistence.Embeddable;
import org.hibernate.validator.constraints.URL;

@Embeddable
public record Url(@URL String value) {}