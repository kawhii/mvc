package com.test51.carl.spring.mongodb.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author Carl
 * @date 2017/1/4
 * 版权所有.(c)2017 - 2020. 卡尔工作室
 */
@Document(collection = "orders")
public class Orders {
    @Id
    private String id;

    @Field("cus_id")
    private String cusId;
    @Field("ord_date")
    private Date ordDate;

    @Field("status")
    private String status;
    @Field("price")
    private float price;

    public String getId() {
        return id;
    }

    public Orders setId(String id) {
        this.id = id;
        return this;
    }

    public String getCusId() {
        return cusId;
    }

    public Orders setCusId(String cusId) {
        this.cusId = cusId;
        return this;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public Orders setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Orders setStatus(String status) {
        this.status = status;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Orders setPrice(float price) {
        this.price = price;
        return this;
    }
}
