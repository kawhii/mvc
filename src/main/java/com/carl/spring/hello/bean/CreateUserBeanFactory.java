package com.carl.spring.hello.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Carl
 * @date 2016/8/27
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
public class CreateUserBeanFactory {

    private ICreateUser createUser;

    public ICreateUser create() {
        return createUser;
    }

    @Autowired
    public void setCreateUser(ICreateUser createUser) {
        System.out.println("spring invoke the method 'setCreateUser'");
        this.createUser = createUser;
    }
}
