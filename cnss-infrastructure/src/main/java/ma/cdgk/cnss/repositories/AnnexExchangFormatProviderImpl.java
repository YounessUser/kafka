package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.AnnexExchangFormat;
import ma.cdgk.cnss.entity.AnnexExchangFormatProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnnexExchangFormatProviderImpl implements AnnexExchangFormatProvider {

    @Autowired
    AnnexExchangFormatRepository annexExchangFormatRepository;

    @Override
    public void delete() {
        annexExchangFormatRepository.deleteAll();
    }

    @Override
    public List<AnnexExchangFormat> getAll() {
        System.out.println(annexExchangFormatRepository.findAll());
        return annexExchangFormatRepository.findAll();
    }

    @Override
    public List<AnnexExchangFormat> saveAll() {
        // 10.1.	Entête de remise - Code type enregistrement 01
        List<AnnexExchangFormat> list = new ArrayList<>();
//        list.add(new AnnexExchangFormat("A1","Code type enregistrement",1,2,2,"N","= 01 : Entête de remise","oui","oui","valeur imposée (= 01) structure remise"));
//        list.add(new AnnexExchangFormat("A2","Zone réservée",3,5,3,"AN","blancs","non","non",""));
//        list.add(new AnnexExchangFormat("B1","Code identifiant du Présentateur",6,8,3,"N","code établissement de la CNSS(à définir conjointement avec les banques)","oui","oui","valeurs référencées"));
//        list.add(new AnnexExchangFormat("B2","Code identifiant de l’Emetteur",9,11,3,"N","code établissement de la CNSS(à définir conjointement avec les banques)","oui","oui","valeurs référencées cohérence Emetteur / Présentateur"));
//        list.add(new AnnexExchangFormat("B3","Code identifiant du Destinataire",12,14,3,"N","code identifiant de la banque partenaire destinataire","oui","oui","valeurs référencées"));
//        list.add(new AnnexExchangFormat("B4","Code identifiant du Récepteur",15,17,3,"N","code identifiant de la banque partenaire récepteur","oui","oui","valeurs référencées"));
//        list.add(new AnnexExchangFormat("B5","Code devise de règlement",18,21,4,"AN","code devise MAD (norme ISO alphabétique)+ nombre de décimales sur 1 caractère","oui","oui","valeurs référencées"));
//        list.add(new AnnexExchangFormat("B6","Date d’échange",22,29,8,"N","Date des opérations de télépaiements. Le jour suivant la date d’exigibilité","oui","oui","Structure de la date AAAAMMJJ"));
//        list.add(new AnnexExchangFormat("B7","Date de création de la remise",30,37,8,"N","#NAME?","oui","oui","Structure de la date AAAAMMJJ"));
//        list.add(new AnnexExchangFormat("B8","Heure de création de la remise",38,41,4,"N","heure de création de la remise par la CNSS.","oui","oui","Structure hhmm"));
//        list.add(new AnnexExchangFormat("B9","Numéro de remise",42,44,3,"N"," numéro","oui","oui","Numérique"));
//        list.add(new AnnexExchangFormat("B10","Type de remise",45,49,5,"AN","= RMAL1 : remise Aller de type 1","oui","oui","RMAL1"));
//        list.add(new AnnexExchangFormat("B11","Longueur des enregistrements de la remise",50,52,3,"N","500","oui","oui","500"));
//        list.add(new AnnexExchangFormat("B12","Code motif de rejet",53,55,3,"N"," zéro (donnée non significative)","non","non",""));
//        list.add(new AnnexExchangFormat("B13","Numéro de la remise acquittée",56,58,3,"N"," zéro (donnée non significative)","non","non",""));
//        list.add(new AnnexExchangFormat("B14","Numéro de la remise à annuler",59,61,3,"N"," zéro (donnée non significative)","non","non",""));
//        list.add(new AnnexExchangFormat("B15","Indicateur de forçage",62,62,1,"AN"," blanc : pas de demande de forçage","non","non",""));
//        list.add(new AnnexExchangFormat("B16","Zone réservée(Identifiant Unique de la  remise)",63,92,30,"AN"," Identifiant Unique de la remise","oui","non",""));
//        list.add(new AnnexExchangFormat("B17","Date de valeur",93,100,8,"N","Date de valeur","oui","oui","Structure AAAAMMJJ"));
//        list.add(new AnnexExchangFormat("B18","Zone réservée pour usage futur",101,500,400,"AN"," blancs","non","non",""));
        return annexExchangFormatRepository.saveAll(list);
    }
}
