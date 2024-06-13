package produce.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/send/{name}")
    public String updateLocation(@PathVariable String name ) {


            this.kafkaService.updateLocation(name);


        return "updated";
    }

}