package com.carl.spring.hello;

import com.carl.spring.hello.event.BlackListNotifier;
import com.carl.spring.hello.event.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置
 * @author Carl
 * @date 2016/8/28
 * @modify 版权所有.(c)2008-2016.广州市森锐电子科技有限公司
 */
@Configuration
public class AppConfig {
    @Bean
    public EmailService emailService() {
        EmailService s = new EmailService();
        List<String> emails = new ArrayList<>(3);
        emails.add("known.spammer@example.org");
        emails.add("known.hacker@example.org");
        emails.add("john.doe@example.org");
        s.setBlackList(emails);
        return s;
    }

    @Bean
    public BlackListNotifier notifier() {
        BlackListNotifier notifier = new BlackListNotifier();
        notifier.setNotificationAddress("blacklist@example.org");
        return notifier;
    }
}
