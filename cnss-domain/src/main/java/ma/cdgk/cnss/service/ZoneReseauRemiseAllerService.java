package ma.cdgk.cnss.service;

import ma.cdgk.cnss.entity.AnnexExchangFormat;
import ma.cdgk.cnss.entity.AnnexExchangFormatProvider;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAller;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneReseauRemiseAllerService {
    @Autowired
    ZoneReseauRemiseAllerProvider zoneReseauRemiseAllerProvider;

    public List<ZoneReseauRemiseAller> saveAll( List<ZoneReseauRemiseAller> records) {

        return zoneReseauRemiseAllerProvider.saveAll(records);
    }
}
