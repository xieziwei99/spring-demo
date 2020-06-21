package com.xzw.webcrud.controller;

import com.xzw.webcrud.constant.LoginConstant;
import com.xzw.webcrud.constant.SessionConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author xieziwei99
 * 2020-06-21
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam String username, @RequestParam String password, Map<String, String> map,
                        HttpSession session) {
        if (!username.isEmpty() && "123456".equals(password)) {
            session.setAttribute(SessionConstant.login_user, username);
            return "redirect:/main";
        } else {
            map.put(LoginConstant.login_msg, "用户名密码错误");
            return "login";
        }
    }
}
