package com.carl.spring.hello.event;

import com.carl.spring.hello.bean.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/8/28.
 */
public class EmailServiceTest extends BaseTest {
    @Test
    public void sendEmail() throws Exception {
        EmailService emailService =context.getBean(EmailService.class);
        emailService.sendEmail("known.spammer@example.org", "foo");
        emailService.sendEmail("known.spammer@example.org", "food");
    }

}