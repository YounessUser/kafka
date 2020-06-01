package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FinRemiseAller")
public class FinRemiseAller extends FinRemise{
    private String nombreTotalOperation;
    private String montantTotalOperation;

    public FinRemiseAller() {
        super();
    }

    public String getNombreTotalOperation() {

        return nombreTotalOperation;
    }

    public void setNombreTotalOperation(String nombreTotalOperation) {
        this.nombreTotalOperation = nombreTotalOperation;
    }

    public String getMontantTotalOperation() {
        return montantTotalOperation;
    }

    public void setMontantTotalOperation(String montantTotalOperation) {
        this.montantTotalOperation = montantTotalOperation;
    }
}
