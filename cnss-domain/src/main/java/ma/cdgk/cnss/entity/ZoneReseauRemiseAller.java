package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ZoneReseauRemiseAller")
public class ZoneReseauRemiseAller extends ZoneReseau{
    public ZoneReseauRemiseAller() {
        super();
    }
}
