package com.xzw.helloworld2;

/**
 * @author xieziwei99
 * 2020-03-30
 */
public class Person {

    private String name;

    private Car car;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}
