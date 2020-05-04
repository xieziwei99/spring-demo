package com.xzw.使用注解.service;

import com.xzw.使用注解.repo.UserRepo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author xieziwei99
 * 2020-05-04
 */
@Service
public class UserService {
    final UserRepo userRepo;

    public UserService(@Qualifier("userRepoImpl2") UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void add() {
        System.out.println("UserService add()");
        userRepo.save();
    }
}
