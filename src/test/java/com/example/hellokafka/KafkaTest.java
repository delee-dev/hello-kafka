package com.example.hellokafka;

import com.example.hellokafka.producer.TestProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaTest {
    // docker zookeeper, kafka 실행 후 run

    @Autowired
    private TestProducer producer;

    @Test
    void test() {
        producer.publish("hello kafka!!");
    }
}
