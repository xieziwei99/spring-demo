package com.xzw.helloworld;

/**
 * @author xieziwei99
 * 2020-03-25
 */
public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld: Constructor");
    }

    public void setName2(String name) {
        System.out.println("set: name = " + name);
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
