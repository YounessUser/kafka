package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.ZoneBanqueRemiseAller;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAller;
import ma.cdgk.cnss.entity.ZoneReseauRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZoneReseauRemiseAllerProviderImp implements ZoneReseauRemiseAllerProvider {
    @Autowired
    ZoneReseauRemiseAllerRepository zoneReseauRemiseAllerRepository;

    @Override
    public List<ZoneReseauRemiseAller> saveAll(List<ZoneReseauRemiseAller> records) {
        return zoneReseauRemiseAllerRepository.saveAll(records);
    }
}
