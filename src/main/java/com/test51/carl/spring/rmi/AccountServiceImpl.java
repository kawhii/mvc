package com.test51.carl.spring.rmi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Carl
 * @date 2016/10/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
public class AccountServiceImpl implements AccountService {
    private Map<String, Account> accountMap = new HashMap<>();

    public void insertAccount(Account acc) {
        System.out.println("AccountServiceImpl.insertAccount");
        if (acc != null) {
            accountMap.put(acc.getName(), acc);
        }
        // do something...
    }

    public Account getAccount(String name) {
        // do something...
        System.out.println("AccountServiceImpl.getAccount");

        return accountMap.get(name);
    }

}
