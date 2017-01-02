package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.bson.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static com.mongodb.client.model.Aggregates.limit;
import static com.mongodb.client.model.Aggregates.sort;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gte;
import static com.mongodb.client.model.Indexes.ascending;
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

    @Test
    public void find1() throws Exception {
        //db.orders.find({"items.price" : {"$gte" : 5}});
        FindIterable iterable = collection().find(gte("items.price", 5));
        iterable.forEach((Block) document ->
                System.out.println(document)
        );
    }

    @Test
    public void find2() throws Exception {
        //db.orders.find({"items.price" : {"$gte" : 1},"price" : 230});
        FindIterable iterable = collection().find(and(gte("items.price", 5), eq("price", 230)));
        iterable.forEach((Block) document ->
                System.out.println(document)
        );
    }

    @Test
    public void createIndex() throws Exception {
        //db.orders.dropIndex({ "cust_id":1})
        //db.orders.createIndex({ "cust_id":1})
        collection().createIndex(ascending("cust_id"));
    }
}