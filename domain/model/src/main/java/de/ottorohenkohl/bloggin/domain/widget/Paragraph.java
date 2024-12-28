package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.widget.constant.Size;
import de.ottorohenkohl.bloggin.domain.widget.value.Text;
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
public class Paragraph extends Widget {
    
    @NotNull
    @Valid
    private Size size;
    
    @NotNull
    @Valid
    private Text text;
    
    @Override
    <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}