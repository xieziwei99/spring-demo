package com.xzw.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xieziwei99
 * 2020-07-05
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable Long id) {
        System.out.println("getProduct: " + id);
        return "success";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String addProduct() {
        System.out.println("addProduct");
        return "success";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
    public String updateProduct(@PathVariable Long id) {
        System.out.println("updateProduct: " + id);
        return "success";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable Long id) {
        System.out.println("deleteProduct: " + id);
        return "success";
    }
}
