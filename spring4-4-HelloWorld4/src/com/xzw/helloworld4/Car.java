package com.xzw.helloworld4;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class Car {

    private final String name;
    private final double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
