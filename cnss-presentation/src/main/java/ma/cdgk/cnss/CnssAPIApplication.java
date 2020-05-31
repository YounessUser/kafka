package ma.cdgk.cnss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"ma.cdgk.cnss.entity"})
public class CnssAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnssAPIApplication.class, args);
    }
}
