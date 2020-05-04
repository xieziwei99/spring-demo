package com.xzw.使用注解;

import com.xzw.使用注解.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user);

        UserController userController = ctx.getBean("userController", UserController.class);
        userController.add();
    }
}
