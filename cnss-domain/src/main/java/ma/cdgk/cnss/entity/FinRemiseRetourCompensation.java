package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FinRemiseRetourCompensation")
public class FinRemiseRetourCompensation extends FinRemise{

    private String nombreOperationRemise;
    private String montantOperationRemise;
    private String nombreOperationPayes;
    private String nombreOperationImpayes;
    private String montanttOTALOperationPayees;
    private String montanttOTALOperationImpayees;

    public FinRemiseRetourCompensation() {
        super();
    }

    public String getNombreOperationRemise() {
        return nombreOperationRemise;
    }

    public void setNombreOperationRemise(String nombreOperationRemise) {
        this.nombreOperationRemise = nombreOperationRemise;
    }

    public String getMontantOperationRemise() {
        return montantOperationRemise;
    }

    public void setMontantOperationRemise(String montantOperationRemise) {
        this.montantOperationRemise = montantOperationRemise;
    }

    public String getNombreOperationPayes() {
        return nombreOperationPayes;
    }

    public void setNombreOperationPayes(String nombreOperationPayes) {
        this.nombreOperationPayes = nombreOperationPayes;
    }

    public String getNombreOperationImpayes() {
        return nombreOperationImpayes;
    }

    public void setNombreOperationImpayes(String nombreOperationImpayes) {
        this.nombreOperationImpayes = nombreOperationImpayes;
    }

    public String getMontanttOTALOperationPayees() {
        return montanttOTALOperationPayees;
    }

    public void setMontanttOTALOperationPayees(String montanttOTALOperationPayees) {
        this.montanttOTALOperationPayees = montanttOTALOperationPayees;
    }

    public String getMontanttOTALOperationImpayees() {
        return montanttOTALOperationImpayees;
    }

    public void setMontanttOTALOperationImpayees(String montanttOTALOperationImpayees) {
        this.montanttOTALOperationImpayees = montanttOTALOperationImpayees;
    }
}
