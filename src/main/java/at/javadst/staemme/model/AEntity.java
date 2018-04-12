package at.javadst.staemme.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class AEntity extends AVersionedEntity {

    @GeneratedValue
    @Id
    private Long id;

}
