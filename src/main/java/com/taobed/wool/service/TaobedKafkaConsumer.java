package com.taobed.wool.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TaobedKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(TaobedKafkaConsumer.class);
    private static final String TOPIC = "topic_taobed";

    @KafkaListener(topics = "topic_taobed", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
