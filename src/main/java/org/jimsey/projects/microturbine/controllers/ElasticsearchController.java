package org.jimsey.projects.microturbine.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;
import org.jimsey.projects.microturbine.elasticsearch.ElasticsearchClient;
import org.jimsey.projects.microturbine.elasticsearch.ElasticsearchException;

@Controller("/elasticsearch")
public class ElasticsearchController {

    @Inject
    ElasticsearchClient client;

    @Get("info")
    @Produces(MediaType.APPLICATION_JSON)
    public String info() throws ElasticsearchException {
        return client.getInfo();
    }

}
