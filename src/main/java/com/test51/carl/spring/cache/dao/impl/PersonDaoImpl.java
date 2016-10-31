package com.test51.carl.spring.cache.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.test51.carl.spring.cache.dao.IPersonDao;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Repository;

/**
 * @author Carl
 * @date 2016/10/31
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
@Repository
@CacheConfig(cacheNames = "cache_person")
public class PersonDaoImpl implements IPersonDao {
    public static final String collectionName = "person";
    @Autowired
    private DB db;


    @Override
    @Caching(cacheable = @Cacheable)
    public Object findById(String id) {
        System.out.println("PersonDaoImpl.findById");
        return find(id);
    }

    private Object find(String id) {
        return db.getCollection(collectionName).findOne(new ObjectId(id));
    }

    @Override
    @CachePut
    public Object findByIdNoCache(String id) {
        System.out.println("PersonDaoImpl.findByIdNoCache");
        return find(id);
    }

    @Override
    @CacheEvict
    public void deleteById(String id) {
        System.out.println("PersonDaoImpl.deleteById");
        BasicDBObject doc = new BasicDBObject();
        doc.put("_id", id);
        db.getCollection(collectionName).remove(doc);
    }
}
