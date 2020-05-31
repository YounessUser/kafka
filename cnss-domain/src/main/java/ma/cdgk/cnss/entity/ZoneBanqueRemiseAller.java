package ma.cdgk.cnss.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ZoneBanqueRemiseAller")
public class ZoneBanqueRemiseAller extends ZoneBanque {

    private String codeNatureCompte;
    private String nomDebiteur;
    private String nomBeneficiaire;
    private String RIBdebiteur;
    private String codeEtablissement;
    private String codeLocalite;
    private String numeroCompte;
    private String cleRIB;
    private String dateCreationAvis;
    private String codeLocaliteLieuCreation;
    private String DateEcheance;

    public ZoneBanqueRemiseAller() {
        super();
    }

    public String getCodeNatureCompte() {
        return codeNatureCompte;
    }

    public void setCodeNatureCompte(String codeNatureCompte) {
        this.codeNatureCompte = codeNatureCompte;
    }

    public String getNomDebiteur() {
        return nomDebiteur;
    }

    public void setNomDebiteur(String nomDebiteur) {
        this.nomDebiteur = nomDebiteur;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getRIBdebiteur() {
        return RIBdebiteur;
    }

    public void setRIBdebiteur(String RIBdebiteur) {
        this.RIBdebiteur = RIBdebiteur;
    }

    public String getCodeEtablissement() {
        return codeEtablissement;
    }

    public void setCodeEtablissement(String codeEtablissement) {
        this.codeEtablissement = codeEtablissement;
    }

    public String getCodeLocalite() {
        return codeLocalite;
    }

    public void setCodeLocalite(String codeLocalite) {
        this.codeLocalite = codeLocalite;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getCleRIB() {
        return cleRIB;
    }

    public void setCleRIB(String cleRIB) {
        this.cleRIB = cleRIB;
    }

    public String getDateCreationAvis() {
        return dateCreationAvis;
    }

    public void setDateCreationAvis(String dateCreationAvis) {
        this.dateCreationAvis = dateCreationAvis;
    }

    public String getCodeLocaliteLieuCreation() {
        return codeLocaliteLieuCreation;
    }

    public void setCodeLocaliteLieuCreation(String codeLocaliteLieuCreation) {
        this.codeLocaliteLieuCreation = codeLocaliteLieuCreation;
    }

    public String getDateEcheance() {
        return DateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        DateEcheance = dateEcheance;
    }
}
