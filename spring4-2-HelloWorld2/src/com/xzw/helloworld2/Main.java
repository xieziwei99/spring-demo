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

        Address address2 = ctx.getBean("address2", Address.class);
        System.out.println(address2);
        Address address3 = ctx.getBean("address3", Address.class);
        System.out.println(address3);

        Person person2 = ctx.getBean("person2", Person.class);
        System.out.println(person2);

        System.out.println("---容器创建成功---");
        System.out.println(ctx.getBean("car2", Car.class) == ctx.getBean("car2", Car.class));   // singleton，所以true
        System.out.println(ctx.getBean("car3", Car.class) == ctx.getBean("car3", Car.class));   // prototype，所以false

        System.out.println(ctx.getBean("car4", Car.class));
    }
}
