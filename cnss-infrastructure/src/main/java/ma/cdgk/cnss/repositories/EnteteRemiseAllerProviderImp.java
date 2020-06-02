package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.EnteteRemiseAller;
import ma.cdgk.cnss.entity.EnteteRemiseAllerProvider;
import ma.cdgk.cnss.entity.FinRemiseAller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnteteRemiseAllerProviderImp implements EnteteRemiseAllerProvider {
    @Autowired
    EnteteRemiseAllerRepository enteteRemiseAllerRepository;

    @Override
    public EnteteRemiseAller save(EnteteRemiseAller record) {
        return enteteRemiseAllerRepository.save(record);
    }
}
