package com.jimsey.projects.micro.kafka;

import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class KafkaHeartbeat {

    @Inject
    KafkaProducer kafka;

    @Scheduled(fixedRate = "10s")
    void heartbeat() {
        kafka.sendHeartbeat("heartbeat", Long.toString(System.nanoTime()));
    }
}
