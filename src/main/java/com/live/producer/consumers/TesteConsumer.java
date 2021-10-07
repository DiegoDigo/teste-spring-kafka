package com.live.producer.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TesteConsumer {

    @KafkaListener(topics = "topic-1", groupId = "group-1")
    public void consumer(String message){
        log.info("Thtrad: {}", Thread.currentThread().getId());
        log.info("Received: {}", message);
    }
}
