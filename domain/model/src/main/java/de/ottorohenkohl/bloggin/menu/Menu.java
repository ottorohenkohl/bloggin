package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.core.value.Name;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Menu extends Identifiable {
    
    @NotNull
    @Valid
    private Name name;
    
    @OneToMany(cascade = CascadeType.REMOVE)
    @NotNull
    private Set<Category> categories = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.REMOVE)
    @NotNull
    private Set<Item> items = new HashSet<>();
}