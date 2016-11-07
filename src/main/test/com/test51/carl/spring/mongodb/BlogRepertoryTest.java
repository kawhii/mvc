package com.test51.carl.spring.mongodb;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.util.JSON;
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


        FindIterable<Document> doc = (FindIterable<Document>) repertory.find();
        doc.forEach(new Block<Document>() {
            public void apply(Document document) {
                System.out.println(JSON.serialize(document));
            }
        });
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
        repertory.deleteBlogById("582080cf562f891c90e29a7e");
    }

    @Test
    public void updateBlog() throws Exception {
        repertory.updateBlog(new Document("time", "20161106"), new Document("content", "carl's blog"));
    }
}