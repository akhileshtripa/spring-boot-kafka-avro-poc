package com.kafka.poc;

import com.kafka.poc.avro.Address;
import com.kafka.poc.avro.Person;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private final KafkaListenerEndpointRegistry registry;

    @Value("${kakfa-avro-poc.records}")
    private Integer numRecords = 1;

    public KafkaConsumer(KafkaListenerEndpointRegistry registry) {
        this.registry = registry;
    }

    @KafkaListener(topics = {"${kakfa-avro-poc.topic}"})
    public void receive(ConsumerRecord<Person, Address> consumerRecord) {
        Person person = consumerRecord.key();
        Address address = consumerRecord.value();
        numRecords--;
        LOGGER.info("consuming {}, {}, remaining {}", person, address, numRecords);
        if (numRecords <= 0) {
            registry.stop();
        }
    }
}
