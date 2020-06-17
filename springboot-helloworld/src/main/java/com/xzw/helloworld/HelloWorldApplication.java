package com.xzw.helloworld;

import com.xzw.helloworld.pojo.Dog;
import com.xzw.helloworld.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
    final Dog dog;
    final Person person;

    public HelloWorldApplication(Dog dog, Person person) {
        this.dog = dog;
        this.person = person;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @GetMapping("/")
    public Object sayHello() {
        return person;
    }
}
