package com.carl.spring.hello.bean;

import org.junit.Assert;
import sun.reflect.annotation.AnnotatedTypeFactory;

import javax.xml.crypto.dsig.TransformException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedParameterizedType;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by Administrator on 2016/8/27.
 */
public class CreateUserImpTest extends BaseTest {
    private ICreateUser createUser;
    private ICreateUser factoryCreateUser;

    @org.junit.Test
    public void getName() throws @MyAnn  Exception {
        createUser = context.getBean("createUser", ICreateUser.class);
        factoryCreateUser = context.getBean("factoryCreateUser", ICreateUser.class);

        Assert.assertNotNull(createUser);
        Assert.assertNotNull(factoryCreateUser);
        System.out.println(createUser.getName());
        Assert.assertEquals(createUser.getName(), "test getName:Carl");
        Assert.assertEquals(factoryCreateUser.getName(), "test getName:Carl");
    }
    public List<@MyAnn(value = "111") String> ll = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        CreateUserImpTest userImpTest = new CreateUserImpTest();
        Field type = userImpTest.getClass().getDeclaredField("ll");
        AnnotatedParameterizedType at = (AnnotatedParameterizedType)type.getAnnotatedType();
        MyAnn ann = at.getAnnotatedActualTypeArguments()[0].getAnnotationsByType(MyAnn.class)[0];
//        MyAnn a = at.getAnnotatedActualTypeArguments()[0];
        System.out.println(ann.value());
//        getClass().getAnnotationsByType(MyAnn.class);
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE})
    public @interface MyAnn {
        String value() default "";
    }
    public interface  aaa<@MyAnn t> {
        public String getName(@MyAnn t t);
        public void method() throws @MyAnn TimeoutException, @MyAnn TransformException;
        }
    }