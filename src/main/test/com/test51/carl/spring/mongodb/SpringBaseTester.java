package com.test51.carl.spring.mongodb;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基础测试类
 * @author Carl
 * @date 2016/10/23
 */
public abstract class SpringBaseTester {
    private ClassPathXmlApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/application-context.xml");
    }

    protected ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
