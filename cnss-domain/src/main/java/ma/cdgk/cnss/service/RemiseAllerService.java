package ma.cdgk.cnss.service;

import ma.cdgk.cnss.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemiseAllerService {
    @Autowired
    RemiseAllerProvider RemiseAllerProvider;

    public RemiseAller save(RemiseAller record) {
        return RemiseAllerProvider.save(record);
    }
}
