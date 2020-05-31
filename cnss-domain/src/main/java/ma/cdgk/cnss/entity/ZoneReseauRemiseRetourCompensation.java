package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ZoneReseauRemiseRetourCompensation")
public class ZoneReseauRemiseRetourCompensation extends ZoneReseau{
    public ZoneReseauRemiseRetourCompensation() {
    }
}
