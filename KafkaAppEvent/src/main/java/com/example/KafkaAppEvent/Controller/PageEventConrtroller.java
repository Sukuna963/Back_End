package com.example.KafkaAppEvent.Controller;

import com.example.KafkaAppEvent.Entities.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class PageEventConrtroller {
    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/publish/{topic}/{name}")
    public PageEvent publish(@PathVariable String topic, @PathVariable String name) {
        PageEvent pageEvent = new PageEvent(name, Math.random()>0.5?"A1":"A3", new Date(), new Random().nextInt(9000));

        streamBridge.send(topic, pageEvent);

        return pageEvent;
    }
}
