package com.xzw.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieziwei99
 * 2020-06-15
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arithmetic arithmetic = ctx.getBean(Arithmetic.class);
        System.out.println(arithmetic.add(1, 2));
        System.out.println(arithmetic.sub(2, 1));
    }
}
