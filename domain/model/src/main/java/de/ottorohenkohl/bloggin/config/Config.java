package de.ottorohenkohl.bloggin.config;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.core.value.Description;
import de.ottorohenkohl.bloggin.core.value.Name;
import de.ottorohenkohl.bloggin.file.File;
import de.ottorohenkohl.bloggin.page.Page;
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
    private Page home;
    
    @NotNull
    @Valid
    private Name name;
}