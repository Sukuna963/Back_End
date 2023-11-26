package com.example.KafkaAppEvent.Service;

import com.example.KafkaAppEvent.Entities.PageEvent;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class PageEventService {
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("***************");
            System.out.println(input.getName());
            System.out.println("***************");
        };
    }

    @Bean
    public Supplier<PageEvent> pageEventSupplier() {
        return() -> new PageEvent(Math.random()>0.5?"X1":"X3",
                                    Math.random()>0.5?"A1":"A3",
                                    new Date(),
                                    new Random().nextInt(9000));
    }

    @Bean
    public Function<PageEvent, PageEvent> pageEventFunction() {
        return(input) -> {
            input.setName("Teste Name");
            input.setUser("Teste User");

            return input;
        };
    }

    @Bean
    public Function<KStream<String, PageEvent>, KStream<String, Long>> kStreamFunction() {
        return(input) -> {
            return input
                    .filter((k,v) -> v.getDuartion()>100)
                    .map((k,v) -> new KeyValue<>(v.getName(), 0L))
                    .groupBy((k,v) -> k, Grouped.with(Serdes.String(), Serdes.Long()))
                    .count()
                    .toStream();
        };
    }
}
