package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="fin_remise_type")
public abstract class FinRemise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String codeTypeEnregistrement;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "remise_id")
    protected Remise remise;

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

    public String getCodeTypeEnregistrement() {
        return codeTypeEnregistrement;
    }

    public void setCodeTypeEnregistrement(String codeTypeEnregistrement) {
        this.codeTypeEnregistrement = codeTypeEnregistrement;
    }


}
