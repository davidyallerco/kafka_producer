package net.yallerco.kafka;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.yallerco.kafka.components.Productor;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
		
		
		Productor productor = new Productor();
		for(int i=1;i<=10 ;i++) {
			productor.send("topicoPrueba", "Mensaje generado a las "+ LocalDateTime.now()+ " para topicoPrueba");
		}
		productor.cerrar();
		
	}

}
