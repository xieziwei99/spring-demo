package com.xzw.泛型依赖注入;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xieziwei99
 * 2020-05-05
 */
public class BaseService<T> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected BaseRepo<T> repo;

    public void add(T t) {
        System.out.println("service add()\n\t" + t);
        repo.save(t);
    }
}
