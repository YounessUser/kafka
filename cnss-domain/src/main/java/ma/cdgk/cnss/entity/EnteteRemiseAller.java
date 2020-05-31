package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EnteteRemiseAller")
public class EnteteRemiseAller extends EnteteRemise {
    private String dateValeur;

    public EnteteRemiseAller() {
        super();
    }

    public String getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(String dateValeur) {
        this.dateValeur = dateValeur;
    }
}
