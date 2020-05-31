package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RemiseRetourCompensation")
public class RemiseRetourCompensation extends Remise{
    public RemiseRetourCompensation() {
        super();
        this.type = "RMRET";
    }
}
