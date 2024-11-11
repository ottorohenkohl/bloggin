package de.ottorohenkohl.bloggin.menu;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.core.value.Name;
import de.ottorohenkohl.bloggin.menu.constant.Primeicon;
import de.ottorohenkohl.bloggin.reference.Reference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
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
public class Item extends Identifiable {
    
    @NotNull
    private Primeicon icon;
    
    @NotNull
    @OrderBy
    @Valid
    private Name name;
    
    @OneToOne(cascade = CascadeType.REMOVE)
    @NotNull
    private Reference reference;
}