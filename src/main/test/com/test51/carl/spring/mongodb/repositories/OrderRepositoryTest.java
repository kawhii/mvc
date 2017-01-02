package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.bson.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static com.mongodb.client.model.Aggregates.limit;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/1/2.
 */

public class OrderRepositoryTest extends SpringBaseTester {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void exists() {
        assertNotNull(orderRepository);
    }

    @Test
    public void count() throws Exception {
        assertEquals(2, collection().count());
    }

    protected MongoCollection<Document> collection() {
        return orderRepository.getDBCollection();
    }

    @Test
    public void limitQuery() throws Exception {
        AggregateIterable iterable = collection().aggregate(Arrays.asList(limit(1)));
        final int[] i = {0};
        iterable.forEach((Block) document -> {
            i[0]++;
            System.out.println(document);
        });
        assertEquals(1, i[0]);
    }
}