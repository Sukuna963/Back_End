package com.example.KafkaProducer.controller;


import com.example.KafkaProducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/send")
    public void send() {
        producerService.sendMessage("This is message");
    }
}
