package de.ottorohenkohl.bloggin.page;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.file.File;
import de.ottorohenkohl.bloggin.page.constant.Layout;
import de.ottorohenkohl.bloggin.page.value.Title;
import de.ottorohenkohl.bloggin.widget.Widget;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import static jakarta.persistence.CascadeType.REMOVE;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Page extends Identifiable {
    
    @ManyToOne
    @Valid
    private File background;
    
    @NotNull
    private Layout layout;
    
    @OneToOne(cascade = REMOVE)
    @Valid
    private Widget root;
    
    @NotNull
    @Valid
    private Title title;
}