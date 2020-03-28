package com.xzw.helloworld;

import java.util.List;
import java.util.Map;

/**
 * @author xieziwei99
 * 2020-03-27
 */
public class Person {

    private String name;
    private int age;
    private Car car;

    private List<Car> knownCars;

    private Map<String, Car> drivingCars;

    public Person() {
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setKnownCars(List<Car> knownCars) {
        this.knownCars = knownCars;
    }

    public void setDrivingCars(Map<String, Car> drivingCars) {
        this.drivingCars = drivingCars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", knownCars=" + knownCars +
                ", drivingCars=" + drivingCars +
                '}';
    }
}
