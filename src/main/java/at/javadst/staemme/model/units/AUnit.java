package at.javadst.staemme.model.units;

import at.javadst.staemme.model.AEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "a_unit")
public class AUnit extends AEntity {

    @Min(0)
    @NotNull
    @Column(name = "attack", nullable = false)
    private Integer attack;

    @Min(0)
    @NotNull
    @Column(name = "defense", nullable = false)
    private Integer defense;

    @Min(0)
    @NotNull
    @Column(name = "specialDefense", nullable = false)
    private Integer specialDefense;

    @Min(0)
    @NotNull
    @Column(name = "moveTime", nullable = false)
    private Integer moveTime;

    @Min(0)
    @NotNull
    @Column(name = "lootCapacity", nullable = false)
    private Integer lootCapacity;


}
