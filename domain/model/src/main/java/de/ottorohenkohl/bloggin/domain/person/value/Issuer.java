package de.ottorohenkohl.bloggin.domain.person.value;

import jakarta.persistence.Embeddable;
import org.hibernate.validator.constraints.URL;

@Embeddable
public record Issuer(@URL String value) {}