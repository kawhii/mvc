package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * blog数据库查询
 * @author Carl
 * @date 2016/10/23
 */
@Repository
public class BlogRepertory {
    public static final String collectionName = "blog";
    @Autowired
    private DB db;

    public Object findOne() {
        return db.getCollection(collectionName).findOne();
    }
}
