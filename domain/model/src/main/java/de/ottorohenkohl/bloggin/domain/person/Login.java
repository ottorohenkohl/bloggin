package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import de.ottorohenkohl.bloggin.domain.person.value.Issuer;
import de.ottorohenkohl.bloggin.domain.person.value.Subject;
import jakarta.persistence.CascadeType;
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
public class Login extends Identifiable {
    
    @NotNull
    @Valid
    private Issuer issuer;
    
    @NotNull
    @Valid
    private Subject subject;
    
    @ManyToOne(cascade = CascadeType.REMOVE)
    @NotNull
    @Valid
    private Person person;
}