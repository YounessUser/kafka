package ma.cdgk.cnss.helpers;

import ma.cdgk.cnss.entity.*;
import ma.cdgk.cnss.service.AnnexExchangFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RemiseAllerStrategy implements RemiseStrategy {

    @Autowired
    AnnexExchangFormatService annexExchangFormatService;

    @Override
    public void saveRemise(String fileName, List<String> remiseContent) {
        RemiseAller remise = getRemiseStrcture(fileName);
        List<AnnexExchangFormat> annexExchangFormats = annexExchangFormatService.findByTypeRemise("RMAL");
        getHeaderData(
                remise,
                remiseContent.get(0),
                annexExchangFormats.stream().filter(
                        annex -> annex.getSection().equals("header")
                ).collect(Collectors.toList())
        );

        getZoneReseauData(
                remise,
                remiseContent.subList(1, remiseContent.size()-1),
                annexExchangFormats.stream().filter(
                        annex -> annex.getSection().equals("zoneReseau")
                ).collect(Collectors.toList())
        );

        getZoneBanqueData(
                remise,
                remiseContent.subList(1, remiseContent.size()-1),
                annexExchangFormats.stream().filter(
                        annex -> annex.getSection().equals("zoneBanque")
                ).collect(Collectors.toList())
        );

        getFooterData(
                remise,
                remiseContent.get(remiseContent.size()-1),
                annexExchangFormats.stream().filter(
                        annex -> annex.getSection().equals("footer")
                ).collect(Collectors.toList())
        );
    }

    private RemiseAller getRemiseStrcture(String fileName) {
        String[] fileNameData = fileName.split("_");
        RemiseAller remiseAller = new RemiseAller();
        remiseAller.setType(fileNameData[0]);
        remiseAller.setCodeBanque(fileNameData[1]);
        remiseAller.setPeriodeDeclaration(fileNameData[2]);
        remiseAller.setAnneeEmissionFichier(fileNameData[3]);
        remiseAller.setMoisEmissionFichier(fileNameData[4]);
        remiseAller.setJourEmissionFichier(fileNameData[5]);
        remiseAller.setTempsEmissionFichier(fileNameData[6]);
        return remiseAller;
    }

    private EnteteRemiseAller getHeaderData(RemiseAller remise, String header, List<AnnexExchangFormat> list){
        Map<String, String> map = getAnnexHasMap(header, list);

        EnteteRemiseAller enteteRemiseAller = new EnteteRemiseAller();
        enteteRemiseAller.setCodeTypeEnregistrement(map.get("A1"));
        enteteRemiseAller.setCodeIdentifiantPresentateur(map.get("B1"));
        enteteRemiseAller.setCodeIdentifiantEmetteur(map.get("B2"));
        enteteRemiseAller.setCodeIdentifiantDestinataire(map.get("B3"));
        enteteRemiseAller.setCodeIdentifiantRecepteur(map.get("B4"));
        enteteRemiseAller.setCodeDevise(map.get("B5"));
        enteteRemiseAller.setDateEchange(map.get("B6"));
        enteteRemiseAller.setDateEchange(map.get("B7"));
        enteteRemiseAller.setDateCreationRemise(map.get("B8"));
        enteteRemiseAller.setNumeroRemise(map.get("B9"));
        enteteRemiseAller.setTypeFlux(map.get("B10"));
        enteteRemiseAller.setLongueurEnregistrements(map.get("B11"));
        enteteRemiseAller.setCodeMotifRejet(map.get("B12"));
        enteteRemiseAller.setNumeroRemisAcquittee(map.get("B13"));
        enteteRemiseAller.setNumeroRemisAnnuller(map.get("B14"));
        enteteRemiseAller.setIndicateurForcage(map.get("B15"));
        enteteRemiseAller.setDateValeur(map.get("B17"));

        enteteRemiseAller.setRemise(remise);

        return enteteRemiseAller;
    }

    private FinRemiseAller getFooterData(RemiseAller remise, String footer, List<AnnexExchangFormat> list){
        Map<String, String> map = getAnnexHasMap(footer, list);

        FinRemiseAller finRemiseAller = new FinRemiseAller();
        finRemiseAller.setCodeTypeEnregistrement(map.get("A1"));
        finRemiseAller.setNombreTotalOperation(map.get("B1"));
        finRemiseAller.setMontantTotalOperation(map.get("B2"));

        finRemiseAller.setRemise(remise);
        return finRemiseAller;
    }

    private List<ZoneReseauRemiseAller> getZoneReseauData(RemiseAller remise, List<String> operations, List<AnnexExchangFormat> list){
        List<ZoneReseauRemiseAller> avisPaiements = new ArrayList<>();
        ZoneReseauRemiseAller zoneReseauRemiseAller = null;
        for (String operation: operations){
            Map<String, String> map = getAnnexHasMap(operation, list);
            zoneReseauRemiseAller = new ZoneReseauRemiseAller();
            zoneReseauRemiseAller.setCodeTypeEnregistrement(map.get("A1"));
            zoneReseauRemiseAller.setCodeTypeOperation(map.get("A2"));
            zoneReseauRemiseAller.setCodeEtablissementParticipantEmetteur(map.get("B1"));
            zoneReseauRemiseAller.setCodeEtablissementParticipantRecepteur(map.get("B2"));
            zoneReseauRemiseAller.setCodeCompensationParticipantEmetteur(map.get("B3.1"));
            zoneReseauRemiseAller.setCodeCompensationParticipantRecepteur(map.get("B3.2"));
            zoneReseauRemiseAller.setReferenceInterbancaireOperation(map.get("B4"));
            zoneReseauRemiseAller.setDateEchange(map.get("B4.1"));
            zoneReseauRemiseAller.setCodeEtablissementEmetteur(map.get("B4.2"));
            zoneReseauRemiseAller.setNumeroRemise(map.get("B4.3"));
            zoneReseauRemiseAller.setReferenceInterne(map.get("B4.4"));
            zoneReseauRemiseAller.setCodeDevise(map.get("B5"));
            zoneReseauRemiseAller.setMontantCompenseTransaction(map.get("B6"));
            zoneReseauRemiseAller.setDateCompensation(map.get("B7"));
            zoneReseauRemiseAller.setDateReglement(map.get("B8"));
            zoneReseauRemiseAller.setCodeMotifRejetTechnique(map.get("B9"));
            zoneReseauRemiseAller.setRemise(remise);
            avisPaiements.add(zoneReseauRemiseAller);
        }
        return avisPaiements;
    }

    private List<ZoneBanqueRemiseAller> getZoneBanqueData(RemiseAller remise, List<String> operations, List<AnnexExchangFormat> list){
        List<ZoneBanqueRemiseAller> avisPaiements = new ArrayList<>();
        ZoneBanqueRemiseAller zoneBanqueRemiseAller = null;
        for (String operation: operations){
            Map<String, String> map = getAnnexHasMap(operation, list);
            zoneBanqueRemiseAller = new ZoneBanqueRemiseAller();
            zoneBanqueRemiseAller.setSousCodeOperation(map.get("C1"));
            zoneBanqueRemiseAller.setCodeNatureCompte(map.get("C5"));
            zoneBanqueRemiseAller.setNomDebiteur(map.get("C6"));
            zoneBanqueRemiseAller.setNomBeneficiaire(map.get("C7"));
            zoneBanqueRemiseAller.setRIBdebiteur(map.get("C8"));
            zoneBanqueRemiseAller.setCodeEtablissement(map.get("C8.1"));
            zoneBanqueRemiseAller.setCodeLocalite(map.get("C8.2"));
            zoneBanqueRemiseAller.setNumeroCompte(map.get("C8.3"));
            zoneBanqueRemiseAller.setCleRIB(map.get("C8.4"));
            zoneBanqueRemiseAller.setDateCreationAvis(map.get("C10"));
            zoneBanqueRemiseAller.setCodeLocaliteLieuCreation(map.get("C11"));
            zoneBanqueRemiseAller.setDateEcheance(map.get("C12"));
            zoneBanqueRemiseAller.setRemise(remise);
            avisPaiements.add(zoneBanqueRemiseAller);
        }
        return avisPaiements;
    }

    private Map<String, String> getAnnexHasMap(String row, List<AnnexExchangFormat> list){
        Map<String, String> map = new HashMap<>();
            list.stream().forEach(item -> map.put(item.getReference(),
                row.substring(item.getStartPosition()-1, item.getEndPosition())));
        return map;
    }

}
