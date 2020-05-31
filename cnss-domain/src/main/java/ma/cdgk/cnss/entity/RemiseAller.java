package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RemiseAller")
public class RemiseAller extends Remise {

    public RemiseAller() {
        super();
        this.type = "RMAL";
    }

    protected String periodeDeclaration;

    public String getPeriodeDeclaration() {
        return periodeDeclaration;
    }

    public void setPeriodeDeclaration(String periodeDeclaration) {
        this.periodeDeclaration = periodeDeclaration;
    }
}
