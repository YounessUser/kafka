package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.AnnexExchangFormat;
import ma.cdgk.cnss.entity.FinRemiseAller;
import ma.cdgk.cnss.entity.FinRemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FinRemiseAllerProviderImp implements FinRemiseAllerProvider {
    @Autowired
    FinRemiseAllerRepository finRemiseAllerRepository;

    @Override
    public FinRemiseAller save(FinRemiseAller record) {
        return finRemiseAllerRepository.save(record);
    }
}
