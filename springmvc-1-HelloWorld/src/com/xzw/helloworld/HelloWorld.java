package com.xzw.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xieziwei99
 * 2020-07-05
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }
}
