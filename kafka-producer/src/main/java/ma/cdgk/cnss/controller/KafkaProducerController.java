package ma.cdgk.cnss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.cdgk.cnss.models.User;
import ma.cdgk.cnss.service.Producer;

@RestController
@RequestMapping("/kafkaProducer")
public class KafkaProducerController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping( value = "/sendData" )
	public ResponseEntity<String> sendData(@RequestBody User user){
		producer.sendData(user);
		return new ResponseEntity<>("Data sent to Kafka", HttpStatus.OK);
	}	
}
