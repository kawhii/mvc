package com.test51.carl.spring.rmi;

import java.io.Serializable;

/**
 * @author Carl
 * @date 2016/10/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
public class Account implements Serializable {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
