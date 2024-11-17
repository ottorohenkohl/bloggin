package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Getter
@Setter
public abstract class Widget extends Identifiable {
    
    @OneToOne(cascade = CascadeType.REMOVE)
    @Valid
    private Widget successor;
    
    abstract <T> T accept(Visitor<T> visitor);
}