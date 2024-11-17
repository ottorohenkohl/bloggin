package de.ottorohenkohl.bloggin.domain.widget;

import de.ottorohenkohl.bloggin.domain.widget.constant.Direction;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.CascadeType.REMOVE;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Alignment extends Widget {
    
    @NotNull
    @OneToOne(cascade = REMOVE)
    @Valid
    private Widget child;
    
    @NotNull
    @Valid
    private Direction direction;
    
    @Override
    <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}