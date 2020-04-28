package ma.cdgk.cnss.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import ma.cdgk.cnss.models.User;

@Service
public class Producer {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "MyTopic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    
    public void sendData(User data) {
    	
        logger.info( "#### -> Producing message (Data) -> " + data.toString() +  " sent to Kafka Topic - " + TOPIC);
        
        Map<String, Object> headers = new HashMap<>();
		headers.put(KafkaHeaders.TOPIC, TOPIC);
		
		Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();
		
		kafkaTemplate.send(message);
    }
    
}
