package de.ottorohenkohl.bloggin.file;

import de.ottorohenkohl.bloggin.core.Identifiable;
import de.ottorohenkohl.bloggin.file.value.Data;
import de.ottorohenkohl.bloggin.file.value.Mimetype;
import jakarta.persistence.Entity;
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
public class File extends Identifiable {
    
    @NotNull
    @Valid
    private Data data;
    
    @NotNull
    @Valid
    private Mimetype mimetype;
}