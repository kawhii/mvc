package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
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
    private MongoDatabase db;

    public Object find() {
        return getDBCollection().find();
    }

    private MongoCollection<Document> getDBCollection() {
        return db.getCollection(collectionName);
    }

    public void saveBlog(Document blog) {
        getDBCollection().insertOne(blog);
    }

    public void deleteBlogById(String id) {
        getDBCollection().deleteOne(new Document("_id", new ObjectId(id)));
    }

    public void updateBlog(Document where, Document set) {
        getDBCollection().updateMany(where, new Document("$set", set));
    }
}
