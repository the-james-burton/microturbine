package org.jimsey.projects.microturbine.kafka;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class KafkaHeartbeat {

    @Inject
    KafkaProducer kafka;

    @Scheduled(fixedRate = "10s")
    void heartbeat() {
        kafka.sendHeartbeat("heartbeat", Long.toString(System.nanoTime()));
    }
}
