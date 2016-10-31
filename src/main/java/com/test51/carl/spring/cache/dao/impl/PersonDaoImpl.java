package com.test51.carl.spring.cache.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.test51.carl.spring.cache.dao.IPersonDao;
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
@CacheConfig(cacheNames = "cache_person")
@Repository
public class PersonDaoImpl implements IPersonDao {
    public static final String collectionName = "person";
    @Autowired
    private DB db;


    @Override
    @Caching(cacheable = @Cacheable, put = @CachePut)
    public Object findById(String id) {
        return findByIdNoCache(id);
    }

    @Override
    public Object findByIdNoCache(String id) {
        BasicDBObject doc = new BasicDBObject();
        doc.put("_id", id);
        return db.getCollection(collectionName).find(doc);
    }

    @Override
    @CacheEvict
    public void deleteById(String id) {
        BasicDBObject doc = new BasicDBObject();
        doc.put("_id", id);
        db.getCollection(collectionName).remove(doc);
    }
}
