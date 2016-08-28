package com.carl.spring.hello.bean;

/**
 * @author Carl
 * @date 2016/8/27
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class CreateUserImp implements ICreateUser {
    private int age;
    private String name;
    public CreateUserImp(String name) {
        this.name = name;
    }
    public String getName() {
        return "test getName:" + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
