package com.test51.carl.spring.mongodb.dao;

import com.test51.carl.spring.mongodb.SpringBaseTester;
import com.test51.carl.spring.mongodb.bean.Orders;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

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
        orders.setOrdDate(new Date());
        orders.setPrice(100);
        orders.setCusId("Y");
        Orders sOrd = ordersRepository.save(orders);
        Orders eo = ordersRepository.findOne(sOrd.getId());
        assertNotNull(eo);
        assertEquals(eo.getCusId(), eo.getCusId());
    }

    @Test
    public void findTop10ByCusId() throws Exception {
        List<Orders> orders = ordersRepository.findTop10ByCusId("Y");
        System.out.println(orders);
    }

    @Test
    public void readTop5ByCusId() throws Exception {
        List<Orders> orders = ordersRepository.readTop5ByCusId("Y");
        System.out.println(orders);
    }
}