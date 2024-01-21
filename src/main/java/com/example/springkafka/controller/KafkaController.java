package com.example.springkafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @GetMapping
    public ResponseEntity<String> testEndPoint() {
        return new ResponseEntity<>("Kafka controller works!", HttpStatus.OK);
    }
}
