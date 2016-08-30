package com.carl.spring.hello.bean.wrapper;

/**
 * @author Carl
 * @date 2016/8/31
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class Employee {

    private String name;

    private float salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}