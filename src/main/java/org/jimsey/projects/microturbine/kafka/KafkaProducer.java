package org.jimsey.projects.microturbine.kafka;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient(id = "KafkaProducer")
public interface KafkaProducer {

    @Topic("heartbeat-events")
    void sendHeartbeat(@KafkaKey String key, String text);

}