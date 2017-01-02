package com.test51.carl.spring.mongodb.repositories;

import org.springframework.stereotype.Repository;

/**
 * @author Carl
 * @date 2017/1/2
 * 版权所有.(c)2017 - 2020. 卡尔工作室
 */
@Repository
public class OrderRepository extends BaseRepository {
    @Override
    public String collectionName() {
        return "order";
    }
}
