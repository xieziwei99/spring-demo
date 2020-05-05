package com.xzw.泛型依赖注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-05-05
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.add(new User().setName("Jack").setAge(18));
    }
}
