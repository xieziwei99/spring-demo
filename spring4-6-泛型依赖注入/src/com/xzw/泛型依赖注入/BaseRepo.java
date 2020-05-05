package com.xzw.泛型依赖注入;

/**
 * @author xieziwei99
 * 2020-05-05
 */
public class BaseRepo<T> {

    public void save(T t) {
        System.out.println("repo save()\n\t" + t);
    }
}
