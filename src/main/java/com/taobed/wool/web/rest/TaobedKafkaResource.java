package com.taobed.wool.web.rest;

import com.taobed.wool.service.TaobedKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/taobed-kafka")
public class TaobedKafkaResource {

    private final Logger log = LoggerFactory.getLogger(TaobedKafkaResource.class);

    private TaobedKafkaProducer kafkaProducer;

    public TaobedKafkaResource(TaobedKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
