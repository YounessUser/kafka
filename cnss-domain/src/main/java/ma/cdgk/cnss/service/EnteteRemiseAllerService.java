package ma.cdgk.cnss.service;

import ma.cdgk.cnss.entity.EnteteRemiseAller;
import ma.cdgk.cnss.entity.EnteteRemiseAllerProvider;
import ma.cdgk.cnss.entity.FinRemiseAller;
import ma.cdgk.cnss.entity.FinRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnteteRemiseAllerService {
    @Autowired
    EnteteRemiseAllerProvider enteteRemiseAllerProvider;

    public EnteteRemiseAller save(EnteteRemiseAller record) {
        return enteteRemiseAllerProvider.save(record);
    }
}
