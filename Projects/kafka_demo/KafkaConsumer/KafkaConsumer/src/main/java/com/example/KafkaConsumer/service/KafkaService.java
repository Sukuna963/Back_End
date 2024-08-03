package com.example.KafkaConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaService {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        System.out.println(String.format("Received Message: [%s]", message));
    }
}
