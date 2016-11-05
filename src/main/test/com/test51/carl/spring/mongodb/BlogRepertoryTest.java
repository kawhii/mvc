package com.test51.carl.spring.mongodb;

import com.test51.carl.spring.mongodb.repositories.BlogRepertory;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;


/**
 * Created by Administrator on 2016/10/23.
 */
public class BlogRepertoryTest extends SpringBaseTester {
    private BlogRepertory repertory;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        repertory = getApplicationContext().getBean(BlogRepertory.class);
        Assert.assertNotNull(repertory);
    }

    @Test
    public void find() throws Exception {


        Object obj = repertory.find();
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }


    @Test
    public void saveBlog() throws Exception {
        /*
        * {
        *   "title":"start mongodb"
        *   "time":"20161106",
        *   "content":"hello mongodb",
        *   "menu" : {
        *       "lan" : ["java", "c++", "python"],
        *       "interest":["爬山", "唱歌"]
        *   }
        * }
        *
        *
        * */
        Document doc = new Document("title", "start mongodb")
                .append("time", "20161106")
                .append("content", "hello mongodb")
                .append("menu", new Document("lan", asList("java", "c++", "python") )
                        .append("interest", asList("爬山", "唱歌")));

        repertory.saveBlog(doc);
    }

    @Test
    public void deleteBlogById() throws Exception {
        repertory.deleteBlogById("581e12bf562f8925e0af42d2");
    }

    @Test
    public void updateBlog() throws Exception {
        repertory.updateBlog(new Document("name", "i like mongodb"), new Document("name", "carl's blog"));
    }
}