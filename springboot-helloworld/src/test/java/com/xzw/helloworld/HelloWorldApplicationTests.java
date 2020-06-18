package com.xzw.helloworld;

import com.xzw.helloworld.pojo.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class HelloWorldApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        Person person = ioc.getBean("person111", Person.class);
        Assertions.assertEquals("Jack", person.getLastName());
        System.out.println(person);
    }

}
