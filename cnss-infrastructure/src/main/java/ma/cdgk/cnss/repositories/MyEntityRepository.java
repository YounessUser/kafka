package ma.cdgk.cnss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.cdgk.cnss.entity.MyEntity;

public interface  MyEntityRepository extends JpaRepository<MyEntity, Long> {

}
