package com.xzw.helloworld;

import com.xzw.helloworld.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping("/testPojo")
    public String testPojo(Product product) {
        System.out.println(product);
        return "success";
    }

    /*
    支持 Servlet 原生 API
        1. HttpServletRequest
        2. HttpServletResponse
        3. HttpSession
        4. java.security.Principal
        5. Locale
        6. InputStream
        7. OutputStream
        8. Reader
        9. Writer
     */
    @RequestMapping("/testServletApi")
    public String testServletApi(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        System.out.println(request.getMethod());    // GET
        System.out.println(request.getRequestURI());    // /springmvc1/testServletApi
        System.out.println(request.getServletPath());   // /testServletApi
        System.out.println(response);
        System.out.println(response.getStatus());   // 200
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("name", "san");
        return modelAndView;
    }
}
