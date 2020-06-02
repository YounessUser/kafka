package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.EnteteRemiseAller;
import ma.cdgk.cnss.entity.ZoneBanqueRemiseAller;
import ma.cdgk.cnss.entity.ZoneBanqueRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZoneBanqueRemiseAllerProviderImp implements ZoneBanqueRemiseAllerProvider {
    @Autowired
    ZoneBanqueRemiseAllerRepository zoneBanqueRemiseAllerRepository;

    @Override
    public List<ZoneBanqueRemiseAller> saveAll(List<ZoneBanqueRemiseAller> records) {
        return zoneBanqueRemiseAllerRepository.saveAll(records);
    }
}
