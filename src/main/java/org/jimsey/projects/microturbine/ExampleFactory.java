package org.jimsey.projects.microturbine;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import org.apache.kafka.streams.kstream.KStream;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Factory
public class ExampleFactory {

    @Singleton
    @Named("example-events")
    KStream<String, String> exampleStream(ConfiguredStreamBuilder builder) {
        return builder.stream("example-events");
    }
}
