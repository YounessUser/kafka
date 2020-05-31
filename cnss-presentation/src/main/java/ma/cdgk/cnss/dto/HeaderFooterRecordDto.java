package ma.cdgk.cnss.dto;

public class HeaderFooterRecordDto {

    private long id;
    private String codeTypeEnregistrement;
    private String codeIdentifiantPresentateur;
    private String codeIdentifiantEmetteur;
    private String codeIdentifiantRecepteur;
    private String codeIdentifiantDestinataire;
    private String codeDevise;
    private String typeFlux;
    private String longueurEnregistrements;

    private String dateEchange;
    private String dateHeureCreationRemise;
    private String numeroRemise;
    private String nombreOperationsRemis;
    private String montantOperationsRemis;
    private String nombreEnregistrementsRemis;

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

    public String getDateEchange() {
        return dateEchange;
    }

    public void setDateEchange(String dateEchange) {
        this.dateEchange = dateEchange;
    }

    public String getDateHeureCreationRemise() {
        return dateHeureCreationRemise;
    }

    public void setDateHeureCreationRemise(String dateHeureCreationRemise) {
        this.dateHeureCreationRemise = dateHeureCreationRemise;
    }

    public String getNumeroRemise() {
        return numeroRemise;
    }

    public void setNumeroRemise(String numeroRemise) {
        this.numeroRemise = numeroRemise;
    }

    public String getNombreOperationsRemis() {
        return nombreOperationsRemis;
    }

    public void setNombreOperationsRemis(String nombreOperationsRemis) {
        this.nombreOperationsRemis = nombreOperationsRemis;
    }

    public String getMontantOperationsRemis() {
        return montantOperationsRemis;
    }

    public void setMontantOperationsRemis(String montantOperationsRemis) {
        this.montantOperationsRemis = montantOperationsRemis;
    }

    public String getNombreEnregistrementsRemis() {
        return nombreEnregistrementsRemis;
    }

    public void setNombreEnregistrementsRemis(String nombreEnregistrementsRemis) {
        this.nombreEnregistrementsRemis = nombreEnregistrementsRemis;
    }

    @Override
    public String toString() {
        return "HeaderFooterRecordDto{" +
                "id=" + id +
                ", codeTypeEnregistrement='" + codeTypeEnregistrement + '\'' +
                ", codeIdentifiantPresentateur='" + codeIdentifiantPresentateur + '\'' +
                ", codeIdentifiantEmetteur='" + codeIdentifiantEmetteur + '\'' +
                ", codeIdentifiantRecepteur='" + codeIdentifiantRecepteur + '\'' +
                ", codeIdentifiantDestinataire='" + codeIdentifiantDestinataire + '\'' +
                ", codeDevise='" + codeDevise + '\'' +
                ", typeFlux='" + typeFlux + '\'' +
                ", longueurEnregistrements='" + longueurEnregistrements + '\'' +
                ", dateEchange='" + dateEchange + '\'' +
                ", dateHeureCreationRemise='" + dateHeureCreationRemise + '\'' +
                ", numeroRemise='" + numeroRemise + '\'' +
                ", nombreOperationsRemis='" + nombreOperationsRemis + '\'' +
                ", montantOperationsRemis='" + montantOperationsRemis + '\'' +
                ", nombreEnregistrementsRemis='" + nombreEnregistrementsRemis + '\'' +
                '}';
    }
}
