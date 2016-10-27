package com.test51.carl.spring.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Carl
 * @date 2016/10/27
 * @since JDK1.7
 * <p>
 * 版权所有.(c)2008-2016.广州市森锐科技股份有限公司
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldCtrl {

    @RequestMapping("/main")
    public String main() {
        System.out.println("....");
        return "";
    }
}
