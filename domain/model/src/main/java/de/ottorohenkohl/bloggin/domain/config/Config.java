package de.ottorohenkohl.bloggin.domain.config;

import de.ottorohenkohl.bloggin.domain.core.Identifiable;
import de.ottorohenkohl.bloggin.domain.core.value.Description;
import de.ottorohenkohl.bloggin.domain.core.value.Name;
import de.ottorohenkohl.bloggin.domain.file.File;
import de.ottorohenkohl.bloggin.domain.site.Site;
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
public class Config extends Identifiable {
    
    @NotNull
    @Valid
    private Description copyright;
    
    @NotNull
    @Valid
    private Description description;
    
    @ManyToOne
    @NotNull
    @Valid
    private File favicon;
    
    @ManyToOne
    @NotNull
    @Valid
    private Site home;
    
    @NotNull
    @Valid
    private Name name;
}