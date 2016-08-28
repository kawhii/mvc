package com.carl.spring.hello.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Carl
 * @date 2016/8/28
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    public void onApplicationEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
        System.out.println("onApplicationEvent, some thing I receive:" + event.getAddress() + ",text:" + event.getTest());
    }

    @EventListener(condition = "#event.test == 'foo'")
    public void onApplicationCustomerEvent(BlackListEvent event) {
        System.out.println("onApplicationCustomerEvent,some thing I receive:" + event.getAddress() + ",text:" + event.getTest());
        // notify appropriate parties via notificationAddress...
    }

    @EventListener(classes = {ContextStartedEvent.class, ContextRefreshedEvent.class})
    public void handleContextStart() {
        System.out.println("-------------handleContextStart");

    }

    /**
     * 参数可以给BlackListEvent 可以不给
     */
    @EventListener(classes = {BlackListEvent.class})
    public void handleBlackListEvent() {
        System.out.println("-------------handleBlackListEvent");

    }
}