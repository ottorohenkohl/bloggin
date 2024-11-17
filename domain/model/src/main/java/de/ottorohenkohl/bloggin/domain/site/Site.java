package de.ottorohenkohl.bloggin.domain.site;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import de.ottorohenkohl.bloggin.domain.file.File;
import de.ottorohenkohl.bloggin.domain.site.constant.Layout;
import de.ottorohenkohl.bloggin.domain.site.value.Title;
import de.ottorohenkohl.bloggin.domain.widget.Widget;
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
public class Site extends Identifiable {
    
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