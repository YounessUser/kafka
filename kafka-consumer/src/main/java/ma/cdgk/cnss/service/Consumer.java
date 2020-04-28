package ma.cdgk.cnss.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
}
