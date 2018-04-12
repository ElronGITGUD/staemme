package at.javadst.staemme.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "village")
public class Village extends AEntity {

    @NotNull
    @Min(0)
    @Column(name = "x", nullable = false)
    private Integer x;

    @NotNull
    @Min(0)
    @Column(name = "y", nullable = false)
    private Integer y;

}
