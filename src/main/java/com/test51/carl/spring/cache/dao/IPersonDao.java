package com.test51.carl.spring.cache.dao;

/**
 * @author Carl
 * @date 2016/10/31
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
public interface IPersonDao {
    Object findById(String id);
    Object findByIdNoCache(String id);

    void deleteById(String id);
}
