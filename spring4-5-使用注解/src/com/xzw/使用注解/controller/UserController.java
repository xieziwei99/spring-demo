package com.xzw.使用注解.controller;

import com.xzw.使用注解.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author xieziwei99
 * 2020-05-04
 */
@Component
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("UserController add()");
        userService.add();
    }
}
