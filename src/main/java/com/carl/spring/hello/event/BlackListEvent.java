package com.carl.spring.hello.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Carl
 * @date 2016/8/28
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class BlackListEvent extends ApplicationEvent {
    private String address;
    private String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
