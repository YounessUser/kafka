package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.FinRemiseAller;
import ma.cdgk.cnss.entity.RemiseAller;
import ma.cdgk.cnss.entity.RemiseAllerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RemiseAllerProviderImp implements RemiseAllerProvider {
    @Autowired
    RemiseAllerRepository remiseAllerRepository;

    @Override
    public RemiseAller save(RemiseAller record) {
        return remiseAllerRepository.save(record);
    }
}
