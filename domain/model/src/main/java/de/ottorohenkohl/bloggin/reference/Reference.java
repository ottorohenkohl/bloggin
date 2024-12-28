package de.ottorohenkohl.bloggin.reference;

import de.ottorohenkohl.bloggin.core.Identifiable;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Getter
@Setter
public abstract class Reference extends Identifiable {
    
    abstract <T> T accept(Visitor<T> visitor);
}