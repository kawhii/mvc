package com.test51.carl.spring.mongodb.dao;

import com.test51.carl.spring.mongodb.bean.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Carl
 * @date 2017/1/4
 * 版权所有.(c)2017 - 2020. 卡尔工作室
 */
public interface OrdersRepository extends CrudRepository<Orders, String> {
    //查找前10个
    List<Orders> findTop10ByCusId(String cusId);
    //查找前5个
    List<Orders> readTop5ByCusId(String cusId);

}
