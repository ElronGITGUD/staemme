package at.javadst.staemme.model.units;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "sword")
public class Sword extends AUnit {
}
