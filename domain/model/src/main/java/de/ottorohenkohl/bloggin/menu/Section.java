package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.core.value.Name;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Section extends Identifiable {
    
    @OneToMany(cascade = CascadeType.REMOVE)
    @NotNull
    private List<Item> items;
    
    @NotNull
    @OrderBy
    @Valid
    private Name name;
}