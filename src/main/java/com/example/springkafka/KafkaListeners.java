package com.example.springkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    //groupid : makes sense when you scale and have more instances of example-topic?
    @KafkaListener(topics = "example-topic", groupId= "foo")
    void listener(String data){
        System.out.println("listener received: "+data+" 🎉");
    }
}
