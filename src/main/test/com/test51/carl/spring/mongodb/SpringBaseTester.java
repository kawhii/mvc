package com.test51.carl.spring.mongodb;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试类
 * @author Carl
 * @date 2016/10/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
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
