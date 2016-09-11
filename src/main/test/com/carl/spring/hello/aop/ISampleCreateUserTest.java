package com.carl.spring.hello.aop;

import com.carl.spring.hello.bean.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/9/11.
 */
public class ISampleCreateUserTest extends BaseTest {
    @Test
    public void create() throws Exception {
        ISampleCreateUser createUser = context.getBean("createUserProxy", ISampleCreateUser.class);
        assertNotNull(createUser);
        String res = createUser.create();
        assertEquals("return res for SampleCreateUserImpl.create()", res);
        System.out.println(res);
    }
}