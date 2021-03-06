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

        Car car = ctx.getBean("car", Car.class);
        System.out.println(car.toString());

        Car car2 = ctx.getBean("car2", Car.class);
        System.out.println(car2.toString());

        Car car3 = ctx.getBean("car3", Car.class);
        System.out.println(car3.toString());

        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);

        Person person2 = ctx.getBean("person2", Person.class);
        System.out.println(person2);

        Person person3 = ctx.getBean("person3", Person.class);
        System.out.println(person3);

        Person person4 = ctx.getBean("person4", Person.class);
        System.out.println(person4);

        Person person5 = ctx.getBean("person5", Person.class);
        System.out.println(person5);

        DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getProperties().getProperty("user"));
    }
}
