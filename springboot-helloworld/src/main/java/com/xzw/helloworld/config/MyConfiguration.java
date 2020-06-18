package com.xzw.helloworld.config;

import com.xzw.helloworld.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xieziwei99
 * 2020-06-18
 */
@Configuration
public class MyConfiguration {

    /*
    方法名，即作为 bean 的 name
     */
    @Bean
    public Person person111() {
        Person person = new Person();
        System.out.println(person);
        person.setLastName("Jack");
        return person;
    }
}
