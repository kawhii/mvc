package com.test51.carl.spring.mongodb.repositories;

import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.test51.carl.spring.mongodb.SpringBaseTester;
import org.bson.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/1/2.
 */
public class SalesRepositoryTest extends SpringBaseTester {
    @Autowired
    private SalesRepository salesRepository;

    protected MongoCollection<Document> collection() {
        return salesRepository.getDBCollection();
    }

    @Test
    public void testGroup() throws Exception {
        /*
        * db.sales.aggregate(
   [
     {
       $group:
         {
            _id: "$count",
           totalAmount: { $sum: "$totalAmount" }
         }
     }
   ]
);
        * */
        //https://docs.mongodb.com/v3.2/reference/operator/aggregation/sum/#grp._S_sum
        AggregateIterable iterable = collection().aggregate(Arrays.asList(group("$count",
                sum("totalAmount", "$totalAmount"))));
        iterable.forEach((Block) document -> {
            System.out.println(document);
        });
    }


}