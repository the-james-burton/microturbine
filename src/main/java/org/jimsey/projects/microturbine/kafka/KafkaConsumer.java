package org.jimsey.projects.microturbine.kafka;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@KafkaListener(groupId = "KafkaConsumer", offsetReset = OffsetReset.EARLIEST)
public class KafkaConsumer {

    @Topic("heartbeat-events")
    public void receive(@KafkaKey String key, String text) {
        log.info("HEARTBEAT: key={} text={}", key, text);
    }
}