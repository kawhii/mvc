package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Indexes;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.bson.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Filters.text;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/1/3.
 */
public class ArticlesRepositoryTest extends SpringBaseTester

{
    @Autowired
    private ArticlesRepository articlesRepository;

    protected MongoCollection<Document> collection() {
        return articlesRepository.getDBCollection();
    }

    @Test
    public void createIndex() throws Exception {
        //db.articles.createIndex({"title":"text"})
        collection().createIndex(Indexes.text("title"));
    }

    @Test
    public void textSearch() throws Exception {
//        db.articles.aggregate(
//                [
//                { $match: { $text: { $search: "cake" } } },
//        { $group: { _id: { $meta: "textScore" }, count: { $sum: 1 } } }
//   ]
//)
        AggregateIterable iterable = collection().aggregate(Arrays.asList(match(text("cake")),
                group(new Document("$meta", "textScore"), sum("count", 1))));
        iterable.forEach((Block) document -> {
            System.out.println(document);
        });
    }


}