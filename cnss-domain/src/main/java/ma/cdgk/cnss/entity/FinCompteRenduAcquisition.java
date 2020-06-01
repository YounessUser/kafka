package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FinCompteRenduAcquisition")
public class FinCompteRenduAcquisition extends FinRemise {

    private String nombreEnregistrementRemise;
    private String nombreSousRemise;

    public FinCompteRenduAcquisition() {
        super();
    }

    public String getNombreEnregistrementRemise() {
        return nombreEnregistrementRemise;
    }

    public void setNombreEnregistrementRemise(String nombreEnregistrementRemise) {
        this.nombreEnregistrementRemise = nombreEnregistrementRemise;
    }

    public String getNombreSousRemise() {
        return nombreSousRemise;
    }

    public void setNombreSousRemise(String nombreSousRemise) {
        this.nombreSousRemise = nombreSousRemise;
    }
}
