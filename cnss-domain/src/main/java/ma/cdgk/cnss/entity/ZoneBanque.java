package ma.cdgk.cnss.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="zone_Banque_type")
public abstract class ZoneBanque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String sousCodeOperation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "remise_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
