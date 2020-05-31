package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="zone_Banque_type")
public abstract class ZoneBanque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String sousCodeOperation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "remise_id")
    protected Remise remise;

    public ZoneBanque() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Remise getRemise() {
        return remise;
    }

    public void setRemise(Remise remise) {
        this.remise = remise;
    }

    public String getSousCodeOperation() {
        return sousCodeOperation;
    }

    public void setSousCodeOperation(String sousCodeOperation) {
        this.sousCodeOperation = sousCodeOperation;
    }
}
