package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import de.ottorohenkohl.bloggin.domain.person.constant.Scope;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Role extends Identifiable {
    
    @ManyToOne
    @NotNull
    @Valid
    private Person person;
    
    @NotNull
    @Valid
    private Scope scope;
}