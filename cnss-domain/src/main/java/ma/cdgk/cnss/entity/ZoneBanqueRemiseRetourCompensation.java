package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ZoneBanqueRemiseRetourCompensation")
public class ZoneBanqueRemiseRetourCompensation extends ZoneBanque{

    private String referenceInterbancaireOperation ;
    private String codeMotif;

    public ZoneBanqueRemiseRetourCompensation() {
        super();
    }

    public String getReferenceInterbancaireOperation() {
        return referenceInterbancaireOperation;
    }

    public void setReferenceInterbancaireOperation(String referenceInterbancaireOperation) {
        this.referenceInterbancaireOperation = referenceInterbancaireOperation;
    }

    public String getCodeMotif() {
        return codeMotif;
    }

    public void setCodeMotif(String codeMotif) {
        this.codeMotif = codeMotif;
    }
}
