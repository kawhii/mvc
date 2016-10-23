package com.test51.carl.spring.mongodb;

import com.test51.carl.spring.mongodb.repositories.BlogRepertory;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Administrator on 2016/10/23.
 */
public class BlogRepertoryTest extends SpringBaseTester {

    @Test
    public void findOne() throws Exception {
        BlogRepertory repertory = getApplicationContext().getBean(BlogRepertory.class);
        Assert.assertNotNull(repertory);
        Object obj = repertory.findOne();
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }

}