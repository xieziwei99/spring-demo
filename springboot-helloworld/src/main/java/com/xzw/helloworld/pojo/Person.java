package com.xzw.helloworld.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xieziwei99
 * 2020-06-17
 */
@Data
@Component
//@ConfigurationProperties(prefix = "person")
@Accessors(chain = true)
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> map;
    private List<String> list;
    private Dog dog;
}
