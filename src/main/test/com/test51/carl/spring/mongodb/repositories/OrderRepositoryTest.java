package com.test51.carl.spring.mongodb.repositories;

import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

}