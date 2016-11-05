package com.test51.carl.spring.mongodb.config;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/10/23.
 */
public class MongoDbConfigTest extends SpringBaseTester {
    private MongoClient mongoClient;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        MongoClient mongoClient = getApplicationContext().getBean(MongoClient.class);

        this.mongoClient = mongoClient;
    }

    @Test
    public void mongoClient() throws Exception {
        assertNotNull(mongoClient);
        assertTrue(mongoClient.listDatabases().first() != null);
    }

    @Test
    public void db() throws Exception {
        MongoDatabase db = getApplicationContext().getBean(MongoDatabase.class);
        assertNotNull(db);
    }
}