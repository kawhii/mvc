package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.client.MongoCollection;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.bson.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/1/2.
 */
public class StudentsRepositoryTest extends SpringBaseTester {
    @Autowired
    private StudentsRepository studentsRepository;

    protected MongoCollection<Document> collection() {
        return studentsRepository.getDBCollection();
    }


    @Test
    public void testCount() throws Exception {

    }
}