package com.xzw.helloworld4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xieziwei99
 * 2020-05-04
 */
public class StaticCarFactory {

    private static final Map<String, Car> carMap = new HashMap<>();

    static {
        carMap.put("audi", new Car("audi", 200000));
        carMap.put("baoma", new Car("baoma", 300000));
    }

    public static Car getCar(String name) {
        return carMap.get(name);
    }
}
