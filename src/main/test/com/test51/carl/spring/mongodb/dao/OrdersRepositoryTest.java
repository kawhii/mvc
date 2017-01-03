package com.test51.carl.spring.mongodb.dao;

import com.test51.carl.spring.mongodb.SpringBaseTester;
import com.test51.carl.spring.mongodb.bean.Orders;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/1/4.
 */
public class OrdersRepositoryTest extends SpringBaseTester {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    @Before
    public void setUp() throws Exception {
        assertNotNull(ordersRepository);
    }

    @Test
    public void save() throws Exception {
        Orders orders = new Orders();
        orders.setCusId("abc-d");
        orders.setOrdDate(new Date());
        orders.setPrice(100);
        orders.setCusId("Y");
        Orders sOrd = ordersRepository.save(orders);
        Orders eo = ordersRepository.findOne(sOrd.getId());
        assertNotNull(eo);
        assertEquals(eo.getCusId(), eo.getCusId());
    }

    @Test
    public void find() throws Exception {

    }
}