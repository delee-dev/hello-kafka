package com.example.hellokafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void publish(String data) {
        kafkaTemplate.send("my-topic", data);
    }
}
