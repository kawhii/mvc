package com.carl.spring.hello.bean;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/8/27.
 */
public class CreateUserImpTest extends BaseTest {
    private ICreateUser createUser;
    private ICreateUser factoryCreateUser;

    @org.junit.Test
    public void getName() throws Exception {
        createUser = context.getBean("createUser", ICreateUser.class);
        factoryCreateUser = context.getBean("factoryCreateUser", ICreateUser.class);

        Assert.assertNotNull(createUser);
        Assert.assertNotNull(factoryCreateUser);
        System.out.println(createUser.getName());
        Assert.assertEquals(createUser.getName(), "test getName:Carl");
        Assert.assertEquals(factoryCreateUser.getName(), "test getName:Carl");
    }


}