package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CompteRenduAcquisition")
public class CompteRenduAcquisition extends Remise
{
    public CompteRenduAcquisition() {
        super();
        this.type = "AQLL";
    }
}
