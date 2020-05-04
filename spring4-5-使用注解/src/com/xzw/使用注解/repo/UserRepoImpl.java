package com.xzw.使用注解.repo;

import org.springframework.stereotype.Repository;

/**
 * @author xieziwei99
 * 2020-05-04
 */
@Repository
public class UserRepoImpl implements UserRepo {

    @Override
    public void save() {
        System.out.println("UserRepoImpl save()");
    }
}
