package com.carl.spring.hello.bean.wrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl
 * @date 2016/8/31
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class Employee {

    private String name;

    private float salary;
    private Map<String, String> keySet = new HashMap<>();
    private int[] factoryId = {1, 2};

    public Map<String, String> getKeySet() {
        return keySet;
    }

    public void setKeySet(Map<String, String> keySet) {
        this.keySet = keySet;
    }

    public int[] getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int[] factoryId) {
        this.factoryId = factoryId;
    }




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