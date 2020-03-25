package com.xzw.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-03-25
 */
public class Main {

    public static void main(String[] args) {
//        // 创建对象
//        HelloWorld helloWorld = new HelloWorld();
//        // 初始化对象
//        helloWorld.setName("Jack");

        // 创建Spring的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从IOC容器中获取bean对象
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        helloWorld.sayHello();
    }
}
