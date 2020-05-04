package com.xzw.helloworld4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);

        Car car1 = ctx.getBean("car1", Car.class);
        System.out.println(car1);
    }
}
