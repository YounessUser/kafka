package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="remise_type")
public abstract class Remise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String type;
    protected String codeBanque;
    protected String anneeEmissionFichier;
    protected String moisEmissionFichier;
    protected String jourEmissionFichier;
    protected String tempsEmissionFichier;


    public Remise() {
    }

    public Remise(long id,
                  String type,
                  String codeBanque,
                  String periodeDeclaration,
                  String anneeEmissionFichier,
                  String moisEmissionFichier,
                  String jourEmissionFichier,
                  String tempsEmissionFichier
    ) {
        this.id = id;
        this.type = type;
        this.codeBanque = codeBanque;
        this.anneeEmissionFichier = anneeEmissionFichier;
        this.moisEmissionFichier = moisEmissionFichier;
        this.jourEmissionFichier = jourEmissionFichier;
        this.tempsEmissionFichier = tempsEmissionFichier;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(String codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getAnneeEmissionFichier() {
        return anneeEmissionFichier;
    }

    public void setAnneeEmissionFichier(String anneeEmissionFichier) {
        this.anneeEmissionFichier = anneeEmissionFichier;
    }

    public String getMoisEmissionFichier() {
        return moisEmissionFichier;
    }

    public void setMoisEmissionFichier(String moisEmissionFichier) {
        this.moisEmissionFichier = moisEmissionFichier;
    }

    public String getJourEmissionFichier() {
        return jourEmissionFichier;
    }

    public void setJourEmissionFichier(String jourEmissionFichier) {
        this.jourEmissionFichier = jourEmissionFichier;
    }

    public String getTempsEmissionFichier() {
        return tempsEmissionFichier;
    }

    public void setTempsEmissionFichier(String tempsEmissionFichier) {
        this.tempsEmissionFichier = tempsEmissionFichier;
    }

    @Override
    public String toString() {
        return "Remise{" +
                "id=" + id + " " +
                 type + '_' +
                 codeBanque + '_' +
                 anneeEmissionFichier + '_' +
                 moisEmissionFichier + '_' +
                 jourEmissionFichier + '_' +
                 tempsEmissionFichier + '_' +
                '}';
    }
}
