package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EnteteRemiseRetourCompensation")
public class EnteteRemiseRetourCompensation extends EnteteRemise{
    public EnteteRemiseRetourCompensation() {
        super();
    }
}
