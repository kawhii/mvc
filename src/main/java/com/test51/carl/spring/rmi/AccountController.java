package com.test51.carl.spring.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Carl
 * @date 2016/10/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountServiceClient;

    @RequestMapping("/test")
    public String test() {
        String name = "123";
        Account account = new Account();
        account.setName(name);
        accountServiceClient.insertAccount(account);
        System.out.println(accountServiceClient.getAccount(name));
        return "hello/hello";
    }
}
