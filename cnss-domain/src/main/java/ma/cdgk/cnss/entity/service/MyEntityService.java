package ma.cdgk.cnss.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cdgk.cnss.entity.MyEntity;
import ma.cdgk.cnss.entity.MyEntityProvider;

import java.util.List;

@Service
public class MyEntityService {

    @Autowired
    MyEntityProvider myEntityProvider;

    public List<MyEntity> getListAll() {

        return myEntityProvider.getAll();
    }
}
