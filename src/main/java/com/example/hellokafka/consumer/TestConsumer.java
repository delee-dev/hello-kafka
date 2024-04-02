package com.example.hellokafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestConsumer {
    @KafkaListener(topics = "my-topic", groupId = "group_1")
    public void subscribe(Object data) {
        System.out.println(data);
    }
}
