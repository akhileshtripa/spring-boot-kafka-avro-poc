package com.kafka.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaPoCApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(KafkaPoCApplicationRunner.class, args);
    }
}
