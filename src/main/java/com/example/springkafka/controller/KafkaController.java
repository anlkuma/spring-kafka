package com.example.springkafka.controller;

import com.example.springkafka.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messages")
public class KafkaController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send("example-topic", messageRequest.message());
    }




    @GetMapping
    public ResponseEntity<String> testEndPoint() {
        return new ResponseEntity<>("Kafka controller works!", HttpStatus.OK);
    }
}
