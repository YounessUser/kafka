package ma.cdgk.cnss.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import ma.cdgk.cnss.models.User;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "MyTopic", groupId = "group_id")
    public void receiveData(User user) throws IOException {
        logger.info("#### -> Received data -> " + user.toString());
    }

    public static void ReadRMAL1File() throws IOException {

        File file = new ClassPathResource("RMAL_054_202001_20200115_140704.dat").getFile();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> rows = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            System.out.println(Arrays.toString(st.split("\\s+")));
            rows.add(st);
        }


    }
}
