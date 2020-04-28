package ma.cdgk.cnss.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.cdgk.cnss.entity.MyEntity;
import ma.cdgk.cnss.entity.MyEntityProvider;

import java.util.List;

@Component
public class MyEntityProviderImpl implements MyEntityProvider {

    @Autowired
    MyEntityRepository myEntityRepository;

	@Override
	public void delete() {
		myEntityRepository.deleteAll();		
	}

	@Override
	public List<MyEntity> getAll() {
		return myEntityRepository.findAll();
	}

}
