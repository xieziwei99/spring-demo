package com.xzw.helloworld.entity;

/**
 * @author xieziwei99
 * 2020-07-08
 */
public class Category {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
