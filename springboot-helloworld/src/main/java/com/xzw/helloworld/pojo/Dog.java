package com.xzw.helloworld.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xieziwei99
 * 2020-06-17
 */
@Data
@Component
@ConfigurationProperties(prefix = "person.dog")
public class Dog {

    private String name;
    private Integer age;
}
