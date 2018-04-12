package at.javadst.staemme.model;

import lombok.Getter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
@Getter
public class AVersionedEntity implements Serializable{

    @Version
    private Long version;

}
