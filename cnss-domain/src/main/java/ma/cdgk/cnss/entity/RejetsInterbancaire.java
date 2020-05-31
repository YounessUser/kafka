package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Table(name = "RejetsInterbancaire")
public class RejetsInterbancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String motif;
    private String label;

    public RejetsInterbancaire() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
