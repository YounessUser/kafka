package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EnteteCompteRenduAcquisition")
public class EnteteCompteRenduAcquisition extends EnteteRemise{
    public EnteteCompteRenduAcquisition() {
        super();
    }
}
