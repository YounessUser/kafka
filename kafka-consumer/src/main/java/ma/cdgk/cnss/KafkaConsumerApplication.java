package ma.cdgk.cnss;

import ma.cdgk.cnss.service.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
@EntityScan(basePackages = {"ma.cdgk.cnss"})
public class KafkaConsumerApplication extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//	    return builder.sources(KafkaConsumerApplication.class);
//	}


	public static void main(String[] args) {
		try {
			Consumer.ReadRMAL1File();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
