package ma.cdgk.cnss.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="entete_remise_type")
public abstract class EnteteRemise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String codeTypeEnregistrement;
    protected String codeIdentifiantPresentateur;
    protected String codeIdentifiantEmetteur;
    protected String codeIdentifiantRecepteur;
    protected String codeIdentifiantDestinataire;
    protected String codeDevise;
    protected String dateEchange;
    protected String dateCreationRemise;
    protected String HeureCreationRemise;
    protected String numeroRemise;
    protected String typeFlux;
    protected String longueurEnregistrements;
    protected String codeMotifRejet;
    protected String numeroRemisAcquittee;
    protected String numeroRemisAnnuller;
    protected String indicateurForcage;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "remise_id")
    protected Remise remise;

    public EnteteRemise() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodeTypeEnregistrement() {
        return codeTypeEnregistrement;
    }

    public void setCodeTypeEnregistrement(String codeTypeEnregistrement) {
        this.codeTypeEnregistrement = codeTypeEnregistrement;
    }

    public String getCodeIdentifiantPresentateur() {
        return codeIdentifiantPresentateur;
    }

    public void setCodeIdentifiantPresentateur(String codeIdentifiantPresentateur) {
        this.codeIdentifiantPresentateur = codeIdentifiantPresentateur;
    }

    public String getCodeIdentifiantEmetteur() {
        return codeIdentifiantEmetteur;
    }

    public void setCodeIdentifiantEmetteur(String codeIdentifiantEmetteur) {
        this.codeIdentifiantEmetteur = codeIdentifiantEmetteur;
    }

    public String getCodeIdentifiantRecepteur() {
        return codeIdentifiantRecepteur;
    }

    public void setCodeIdentifiantRecepteur(String codeIdentifiantRecepteur) {
        this.codeIdentifiantRecepteur = codeIdentifiantRecepteur;
    }

    public String getCodeIdentifiantDestinataire() {
        return codeIdentifiantDestinataire;
    }

    public void setCodeIdentifiantDestinataire(String codeIdentifiantDestinataire) {
        this.codeIdentifiantDestinataire = codeIdentifiantDestinataire;
    }

    public String getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(String codeDevise) {
        this.codeDevise = codeDevise;
    }

    public String getDateEchange() {
        return dateEchange;
    }

    public void setDateEchange(String dateEchange) {
        this.dateEchange = dateEchange;
    }

    public String getDateCreationRemise() {
        return dateCreationRemise;
    }

    public void setDateCreationRemise(String dateCreationRemise) {
        this.dateCreationRemise = dateCreationRemise;
    }

    public String getHeureCreationRemise() {
        return HeureCreationRemise;
    }

    public void setHeureCreationRemise(String heureCreationRemise) {
        HeureCreationRemise = heureCreationRemise;
    }

    public String getNumeroRemise() {
        return numeroRemise;
    }

    public void setNumeroRemise(String numeroRemise) {
        this.numeroRemise = numeroRemise;
    }

    public String getTypeFlux() {
        return typeFlux;
    }

    public void setTypeFlux(String typeFlux) {
        this.typeFlux = typeFlux;
    }

    public String getLongueurEnregistrements() {
        return longueurEnregistrements;
    }

    public void setLongueurEnregistrements(String longueurEnregistrements) {
        this.longueurEnregistrements = longueurEnregistrements;
    }

    public String getCodeMotifRejet() {
        return codeMotifRejet;
    }

    public void setCodeMotifRejet(String codeMotifRejet) {
        this.codeMotifRejet = codeMotifRejet;
    }

    public String getNumeroRemisAcquittee() {
        return numeroRemisAcquittee;
    }

    public void setNumeroRemisAcquittee(String numeroRemisAcquittee) {
        this.numeroRemisAcquittee = numeroRemisAcquittee;
    }

    public String getNumeroRemisAnnuller() {
        return numeroRemisAnnuller;
    }

    public void setNumeroRemisAnnuller(String numeroRemisAnnuller) {
        this.numeroRemisAnnuller = numeroRemisAnnuller;
    }

    public String getIndicateurForcage() {
        return indicateurForcage;
    }

    public void setIndicateurForcage(String indicateurForcage) {
        this.indicateurForcage = indicateurForcage;
    }

    public Remise getRemise() {
        return remise;
    }

    public void setRemise(Remise remise) {
        this.remise = remise;
    }
}
