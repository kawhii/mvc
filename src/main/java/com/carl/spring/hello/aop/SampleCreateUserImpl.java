package com.carl.spring.hello.aop;

import org.springframework.stereotype.Service;

/**
 * @author Carl
 * @date 2016/9/11
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
@Service("sampleCreateUser")
public class SampleCreateUserImpl implements ISampleCreateUser {
    @Override
    public String create() {
        System.out.println("invoking SampleCreateUserImpl.create()");
        return "return res for SampleCreateUserImpl.create()";
    }
}
