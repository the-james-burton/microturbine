package com.jimsey.projects.micro;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.extern.slf4j.Slf4j;

/**
 * kafka-streams requires at least one listener
 */
@Slf4j
@KafkaListener(groupId = "ExampleListener")
public class ExampleListener {

    @Topic("example-events")
    void example() {
        log.info("example-events");
    }
}