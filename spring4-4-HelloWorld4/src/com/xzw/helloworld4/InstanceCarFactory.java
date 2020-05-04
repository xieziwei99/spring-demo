package com.xzw.helloworld4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class InstanceCarFactory {

    private final Map<String, Car> carMap;

    public InstanceCarFactory() {
        carMap = new HashMap<>();
        carMap.put("audi", new Car("audi", 200000));
        carMap.put("baoma", new Car("baoma", 300000));
    }

    public Car getCar(String name) {
        return carMap.get(name);
    }
}
