package com.test51.carl.spring.rmi;

import java.util.List;

/**
 * @author Carl
 * @date 2016/10/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
public interface AccountService {

    public void insertAccount(Account account);

    public Account getAccount(String name);

}
