package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import de.ottorohenkohl.bloggin.domain.core.value.Name;
import de.ottorohenkohl.bloggin.domain.file.File;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
public class Person extends Identifiable {
    
    @ManyToOne(cascade = CascadeType.REMOVE)
    @NotNull
    @Valid
    private File avatar;
    
    @NotNull
    @Valid
    private Name nickname;
    
    @Column(unique = true)
    @NotNull
    @Valid
    private Name username;
}