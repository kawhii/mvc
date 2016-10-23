package com.test51.carl.spring.mongodb.config;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

/**
 * @author Carl
 * @date 2016/10/23
 */
@Configuration
public class MongoDbConfig {
    @Bean
    public MongoClient mongoClient(@Value("${mongodb.host}") String host) throws UnknownHostException {
        return new MongoClient(host);
    }

    @Bean
    public DB db(@Value("${mongodb.db_name}") String dbName, @Value("${mongodb.host}") String host) throws UnknownHostException {
        return mongoClient(host).getDB(dbName);
    }
}
