package com.carl.spring.hello.bean;

/**
 * Created by Carl on 2016/8/27.
 */
public interface ICreateUser {
    String getName();

    default String getScope() {
        return "user";
    }
}
