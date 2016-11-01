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
    private String id = "56e19bbd0c1a270f0843841c";
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        personDao = getApplicationContext().getBean(IPersonDao.class);
        Assert.assertNotNull(personDao);
    }

    @Test
    public void findById() throws Exception {
        //personDao.deleteById(id);
        personDao.findByIdNoCache(id);
        Object obj = personDao.findById(id);
        personDao.findById(id);
        personDao.deleteById(id);
        personDao.findById(id);
        System.out.println(obj);
    }

    @Test
    public void findByIdNoCache() throws Exception {
        Object obj = personDao.findByIdNoCache(id);
        System.out.println(obj);
    }

    @Test
    public void deleteById() throws Exception {
        personDao.deleteById(id);
    }

}