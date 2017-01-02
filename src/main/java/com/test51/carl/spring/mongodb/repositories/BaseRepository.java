package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Carl
 * @date 2017/1/2
 * 版权所有.(c)2017 - 2020. 卡尔工作室
 */
public abstract class BaseRepository implements IRepository {
    @Autowired
    private MongoDatabase db;

    @Override
    public MongoDatabase getDb() {
        return db;
    }
}
