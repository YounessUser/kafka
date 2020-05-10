package ma.cdgk.cnss.entity.service;

import ma.cdgk.cnss.entity.AnnexExchangFormat;
import ma.cdgk.cnss.entity.AnnexExchangFormatProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnexExchangFormatService {
    @Autowired
    AnnexExchangFormatProvider annexExchangFormatProvider;

    public List<AnnexExchangFormat> saveAll() {

        return annexExchangFormatProvider.saveAll();
    }
}
