package com.xzw.helloworld2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-03-30
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);
    }
}
