package com.test51.carl.spring.mongodb.config;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.net.UnknownHostException;

/**
 * @author Carl
 * @date 2016/10/23
 */
@Configuration
public class MongoDbConfig {
    @Bean
    public MongoClient mongoClient(@Value("${mongodb.host}") String host) {
        return new MongoClient(host);
    }

    @Bean
    public MongoDatabase db(@Value("${mongodb.db_name}") String dbName, @Value("${mongodb.host}") String host) throws UnknownHostException {
        return mongoClient(host).getDatabase(dbName);
    }

    @Bean
    public MongoTemplate mongoTemplate(@Value("${mongodb.host}") String host, @Value("${mongodb.db_name}") String dbName) {
        MongoTemplate template = new MongoTemplate(mongoClient(host), dbName);
        return template;
    }
}
