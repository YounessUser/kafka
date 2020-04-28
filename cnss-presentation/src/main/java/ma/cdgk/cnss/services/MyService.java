package ma.cdgk.cnss.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cdgk.cnss.entity.MyEntity;
import ma.cdgk.cnss.entity.service.MyEntityService;

import java.util.List;

@Service
public class MyService {

    @Autowired
    MyEntityService myEntityService;

    public List<MyEntity> listAll() {
        return myEntityService.getListAll();
    }
}
