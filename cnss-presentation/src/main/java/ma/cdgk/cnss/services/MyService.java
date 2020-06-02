package ma.cdgk.cnss.services;

import ma.cdgk.cnss.dto.HeaderFooterRecordDto;
import ma.cdgk.cnss.entity.*;
import ma.cdgk.cnss.helpers.RMALService;
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

    @Autowired
    RMALService rmalService;


    //
    public void extractDataFormRMAL() throws IOException {
        File file = new File("D:\\cnss\\cnss\\RMAL_RECU\\RMAL_054_202001_20200115_140704.dat");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> rows = new ArrayList<String>();
        while ((st = br.readLine()) != null) {
            System.out.println(Arrays.toString(st.split("\\s+")));
            rows.add(st);
        }
        System.out.println(file.getName());

        rmalService.saveRemise(file.getName(), rows);
    }

}


