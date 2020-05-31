package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Table(name = "LongueurEnregistrement")
public class LongueurEnregistrement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int longueur;
    private String remise;
    private String label;

    public LongueurEnregistrement() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public String getRemise() {
        return remise;
    }

    public void setRemise(String remise) {
        this.remise = remise;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "LongueurEnregistrement{" +
                "longueur=" + longueur +
                ", remise='" + remise + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
