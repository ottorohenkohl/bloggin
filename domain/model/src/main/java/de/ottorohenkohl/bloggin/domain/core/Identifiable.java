package de.ottorohenkohl.bloggin.domain.core;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.core.value.Type;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import static jakarta.persistence.InheritanceType.TABLE_PER_CLASS;
import static java.util.UUID.randomUUID;

@Inheritance(strategy = TABLE_PER_CLASS)
@Entity
@EqualsAndHashCode
@Getter
@ToString
public abstract class Identifiable {
    
    @EmbeddedId
    protected Identifier identifier = new Identifier(randomUUID().toString());
    
    @Transient
    protected Type type = new Type(getClass());
}