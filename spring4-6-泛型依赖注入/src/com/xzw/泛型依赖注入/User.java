package com.xzw.泛型依赖注入;

/**
 * @author xieziwei99
 * 2020-05-05
 */
public class User {

    private String name;
    private int age;

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
