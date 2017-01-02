package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @author Carl
 * @date 2017/1/2
 * 版权所有.(c)2017 - 2020. 卡尔工作室
 */
public interface IRepository {
    /**
     * 集合名字
     *
     * @return
     */
    String collectionName();

    /**
     * 具体数据库
     * @return
     */
    MongoDatabase getDb();

    /**
     * 获取集合
     *
     * @return
     */
    default MongoCollection<Document> getDBCollection() {
        MongoDatabase db = getDb();
        return db.getCollection(collectionName());
    }
}
