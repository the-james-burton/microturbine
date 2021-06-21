package com.jimsey.projects.micro.controllers;

import com.jimsey.projects.micro.elasticsearch.ElasticsearchClient;
import com.jimsey.projects.micro.elasticsearch.ElasticsearchException;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;

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
