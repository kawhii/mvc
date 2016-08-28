package com.carl.spring.hello.bean;


import org.junit.Assert;
import org.springframework.context.MessageSource;

/**
 * Created by Administrator on 2016/8/28.
 */
public class AppConfigTest extends BaseTest {

    @org.junit.Test
    public void message() throws Exception {
        MessageSource messageSource = context;
        String msg = messageSource.getMessage("message", null, "Default", null);
        System.out.println(msg);
        Assert.assertEquals(msg, "Alligators rock!");
    }
}