package consumer.kafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = "shivam", groupId = "group-1")
    public void updatedLocation(String value) {
        System.out.println(value);
    }
}
