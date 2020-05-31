package ma.cdgk.cnss.services;

import ma.cdgk.cnss.dto.HeaderFooterRecordDto;
import ma.cdgk.cnss.entity.*;
import ma.cdgk.cnss.service.AnnexExchangFormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Service
public class MyService {


    @Autowired
    AnnexExchangFormatService annexExchangFormatService;


    //
    public Map<String, String> extractData() throws IOException {


        File file = new File("D:\\cnss\\cnss\\RMAL_RECU\\RMAL_054_202001_20200115_140704.dat");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> rows = new ArrayList<String>();
        while ((st = br.readLine()) != null) {
            System.out.println(Arrays.toString(st.split("\\s+")));
            rows.add(st);
        }
        String header = rows.get(0);
        List<AnnexExchangFormat> list = annexExchangFormatService.getAll();
  //      List<AnnexExchangFormat> list = new ArrayList<AnnexExchangFormat>();
        System.out.println(list);
        Map<String, String> map = new HashMap<>();
        list.stream().forEach(item -> map.put(item.getReference(),
                header.substring(item.getStartPosition()-1, item.getEndPosition())));


        return map;

    }

    public Remise getHeaderFooterData(String fileName) {
        String[] fileNameData = fileName.split("_");
        Remise remise = null;
        switch (fileNameData[0]){
            case "RMAL":
                remise = new RemiseAller();
                ((RemiseAller) remise).setPeriodeDeclaration(fileNameData[0]);
                break;
            case "AQLL":
                remise = new CompteRenduAcquisition();
                break;
            case "RMRET":
                remise = new RemiseRetourCompensation();
                break;
        }
        remise.setType(fileNameData[0]);
        remise.setCodeBanque(fileNameData[1]);
        remise.setAnneeEmissionFichier(fileNameData[3]);
        remise.setMoisEmissionFichier(fileNameData[4]);
        remise.setJourEmissionFichier(fileNameData[5]);
        remise.setTempsEmissionFichier(fileNameData[6]);

        return remise;
    }



    public HeaderFooterRecordDto getHeaderFooterData(Map<String, String> map, int linesCount){
        HeaderFooterRecordDto headerFooterRecordDto = new HeaderFooterRecordDto();
        headerFooterRecordDto.setCodeTypeEnregistrement(map.get("A1"));
        headerFooterRecordDto.setCodeIdentifiantPresentateur(map.get("B1"));
        headerFooterRecordDto.setCodeIdentifiantEmetteur(map.get("B2"));
        headerFooterRecordDto.setCodeIdentifiantDestinataire(map.get("B3"));
        headerFooterRecordDto.setCodeIdentifiantRecepteur(map.get("B4"));
        headerFooterRecordDto.setCodeDevise(map.get("B5"));
        headerFooterRecordDto.setTypeFlux(map.get("B10"));
        headerFooterRecordDto.setLongueurEnregistrements(map.get("B11"));
        headerFooterRecordDto.setDateEchange(map.get("B11"));
        headerFooterRecordDto.setDateHeureCreationRemise(map.get("B11"));
        headerFooterRecordDto.setNumeroRemise(map.get("B11"));
        headerFooterRecordDto.setNombreEnregistrementsRemis(""+(linesCount-2));

        System.out.println(headerFooterRecordDto);
        return headerFooterRecordDto;
    }

}


