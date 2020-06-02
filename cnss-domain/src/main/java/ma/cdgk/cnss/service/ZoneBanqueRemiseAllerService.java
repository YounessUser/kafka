package ma.cdgk.cnss.service;

import ma.cdgk.cnss.entity.ZoneBanqueRemiseAller;
import ma.cdgk.cnss.entity.ZoneBanqueRemiseAllerProvider;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAller;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneBanqueRemiseAllerService {
    @Autowired
    ZoneBanqueRemiseAllerProvider zoneBanqueRemiseAllerProvider;

    public List<ZoneBanqueRemiseAller> saveAll(List<ZoneBanqueRemiseAller> records) {

        return zoneBanqueRemiseAllerProvider.saveAll(records);
    }
}
