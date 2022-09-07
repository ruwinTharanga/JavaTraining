package com.example.KafkaQ9.Controller;

import com.example.KafkaQ9.ABC.kafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v5/kafkaController/")
public class kafkaController {

    kafkaProducer kafkaProducer;

    public kafkaController(kafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping(path = "/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){

        kafkaProducer.send(message);
        return ResponseEntity.ok("Message Sent");
    }

}
