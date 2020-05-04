package com.xzw.helloworld4;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Car getObject() {
        return new Car(name, 500000);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
