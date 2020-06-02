package ma.cdgk.cnss.service;

import ma.cdgk.cnss.entity.FinRemiseAller;
import ma.cdgk.cnss.entity.FinRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinRemiseAllerService {
    @Autowired
    FinRemiseAllerProvider finRemiseAllerProvider;

    public FinRemiseAller save(FinRemiseAller record) {
        return finRemiseAllerProvider.save(record);
    }
}
