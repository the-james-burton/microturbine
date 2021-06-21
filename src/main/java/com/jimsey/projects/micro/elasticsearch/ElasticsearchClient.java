package com.jimsey.projects.micro.elasticsearch;

import io.vavr.control.Try;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.MainResponse;

import javax.inject.Inject;

public class ElasticsearchClient {

    @Inject
    RestHighLevelClient client;

    public String getInfo() throws ElasticsearchException {
        MainResponse info = Try.of(() -> client.info(RequestOptions.DEFAULT))
                .getOrElseThrow(e -> new ElasticsearchException("Unable to get elasticsearch info", e));
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE).
                append("clusterName", info.getClusterName()).
                append("clusterUuid", info.getClusterUuid()).
                append("nodeName", info.getNodeName()).
                append("tagLine", info.getTagline()).
                append("version", info.getVersion().getNumber()).
                append("luceneVersion", info.getVersion().getLuceneVersion()).
                toString();
    }
}
