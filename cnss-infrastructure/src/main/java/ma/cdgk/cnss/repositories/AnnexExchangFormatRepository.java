package ma.cdgk.cnss.repositories;

import ma.cdgk.cnss.entity.AnnexExchangFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AnnexExchangFormatRepository extends JpaRepository<AnnexExchangFormat, Long> {
    @Query("SELECT a FROM AnnexExchangFormat a WHERE a.remise = ?1")
    List<AnnexExchangFormat> findByTypeRemise(String typeRemise);
}
