package ma.cdgk.cnss.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="zone_Reseau_type")
public abstract class ZoneReseau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    protected String codeTypeEnregistrement;
    protected String codeTypeOperation;
    protected String codeEtablissementParticipantEmetteur;
    protected String codeEtablissementParticipantRecepteur;
    protected String codeCompensationParticipantEmetteur;
    protected String codeCompensationParticipantRecepteur;
    protected String referenceInterbancaireOperation;
    protected String dateEchange;
    protected String codeEtablissementEmetteur;
    protected String numeroRemise;
    protected String referenceInterne;
    protected String codeDevise;
    protected String montantCompenseTransaction;
    protected String dateCompensation;
    protected String dateReglement;
    protected String codeMotifRejetTechnique;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "remise_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Remise remise;

    public ZoneReseau() {
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

    public String getCodeTypeOperation() {
        return codeTypeOperation;
    }

    public void setCodeTypeOperation(String codeTypeOperation) {
        this.codeTypeOperation = codeTypeOperation;
    }

    public String getCodeEtablissementParticipantEmetteur() {
        return codeEtablissementParticipantEmetteur;
    }

    public void setCodeEtablissementParticipantEmetteur(String codeEtablissementParticipantEmetteur) {
        this.codeEtablissementParticipantEmetteur = codeEtablissementParticipantEmetteur;
    }

    public String getCodeEtablissementParticipantRecepteur() {
        return codeEtablissementParticipantRecepteur;
    }

    public void setCodeEtablissementParticipantRecepteur(String codeEtablissementParticipantRecepteur) {
        this.codeEtablissementParticipantRecepteur = codeEtablissementParticipantRecepteur;
    }

    public String getCodeCompensationParticipantEmetteur() {
        return codeCompensationParticipantEmetteur;
    }

    public void setCodeCompensationParticipantEmetteur(String codeCompensationParticipantEmetteur) {
        this.codeCompensationParticipantEmetteur = codeCompensationParticipantEmetteur;
    }

    public String getCodeCompensationParticipantRecepteur() {
        return codeCompensationParticipantRecepteur;
    }

    public void setCodeCompensationParticipantRecepteur(String codeCompensationParticipantRecepteur) {
        this.codeCompensationParticipantRecepteur = codeCompensationParticipantRecepteur;
    }

    public String getReferenceInterbancaireOperation() {
        return referenceInterbancaireOperation;
    }

    public void setReferenceInterbancaireOperation(String referenceInterbancaireOperation) {
        this.referenceInterbancaireOperation = referenceInterbancaireOperation;
    }

    public String getDateEchange() {
        return dateEchange;
    }

    public void setDateEchange(String dateEchange) {
        this.dateEchange = dateEchange;
    }

    public String getCodeEtablissementEmetteur() {
        return codeEtablissementEmetteur;
    }

    public void setCodeEtablissementEmetteur(String codeEtablissementEmetteur) {
        this.codeEtablissementEmetteur = codeEtablissementEmetteur;
    }

    public String getNumeroRemise() {
        return numeroRemise;
    }

    public void setNumeroRemise(String numeroRemise) {
        this.numeroRemise = numeroRemise;
    }

    public String getReferenceInterne() {
        return referenceInterne;
    }

    public void setReferenceInterne(String referenceInterne) {
        this.referenceInterne = referenceInterne;
    }

    public String getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(String codeDevise) {
        this.codeDevise = codeDevise;
    }

    public String getMontantCompenseTransaction() {
        return montantCompenseTransaction;
    }

    public void setMontantCompenseTransaction(String montantCompenseTransaction) {
        this.montantCompenseTransaction = montantCompenseTransaction;
    }

    public String getDateCompensation() {
        return dateCompensation;
    }

    public void setDateCompensation(String dateCompensation) {
        this.dateCompensation = dateCompensation;
    }

    public String getCodeMotifRejetTechnique() {
        return codeMotifRejetTechnique;
    }

    public void setCodeMotifRejetTechnique(String codeMotifRejetTechnique) {
        this.codeMotifRejetTechnique = codeMotifRejetTechnique;
    }

    public String getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(String dateReglement) {
        this.dateReglement = dateReglement;
    }

    public Remise getRemise() {
        return remise;
    }

    public void setRemise(Remise remise) {
        this.remise = remise;
    }
}
