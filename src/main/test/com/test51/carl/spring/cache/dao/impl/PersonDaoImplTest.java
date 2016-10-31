package com.test51.carl.spring.cache.dao.impl;

import com.test51.carl.spring.cache.dao.IPersonDao;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by Administrator on 2016/10/31.
 */
public class PersonDaoImplTest extends SpringBaseTester {
    private IPersonDao personDao;
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        personDao = getApplicationContext().getBean(PersonDaoImpl.class);
        Assert.assertNotNull(personDao);
    }

    @Test
    public void findById() throws Exception {
        Object obj = personDao.findById("58171df8681f8e7c5c4aab7d");
        System.out.println(obj);
    }

    @Test
    public void findByIdNoCache() throws Exception {

    }

    @Test
    public void deleteById() throws Exception {

    }

}