package de.ottorohenkohl.bloggin.widget;

import de.ottorohenkohl.bloggin.file.File;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class Image extends Widget {
    
    @ManyToOne
    @NotNull
    private File file;
    
    @Override
    <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}