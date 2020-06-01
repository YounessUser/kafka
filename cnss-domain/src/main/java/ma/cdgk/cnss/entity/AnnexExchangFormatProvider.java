package ma.cdgk.cnss.entity;

import java.util.List;

public interface AnnexExchangFormatProvider {
    void delete();
    List<AnnexExchangFormat> getAll();
    List<AnnexExchangFormat> saveAll();
    List<AnnexExchangFormat> findByTypeRemise(String typeRemise);
}
