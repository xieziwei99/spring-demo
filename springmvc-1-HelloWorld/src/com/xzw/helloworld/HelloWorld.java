package com.xzw.helloworld;

import com.xzw.helloworld.entity.Person;
import com.xzw.helloworld.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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

    /*
    也可以使用 Model or ModelMap
     */
    @RequestMapping("testMap")
    public String testMap(Map<String, Object> map) {
        System.out.println(map.getClass().getName());
        map.put("name", "testMap");
        return "success";
    }


    @ModelAttribute
    public void 被ModelAttribute标记在所有方法前运行(
            @RequestParam(value = "id", required = false) Integer id, Model model) {
        System.out.println("enter 被ModelAttribute标记在所有方法前运行()...");
        if (id != null) {
            Person person = new Person();
            person.setId(id);
            person.setName("Queen");
            person.setIdCardNumber("433325200001010001");
            model.addAttribute("person", person);
        }
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("person") Person person) {
        System.out.println("testModelAttribute: " + person);
        return "success";
    }

    @RequestMapping("/testMyView")
    public String test自定义视图() {
        System.out.println("test自定义视图");
        return "myHelloView";   // @Component 标注，会在容器中配置一个类名小写的 bean
    }

    /*
    转发和重定向
        - 转发：服务器行为，地址栏的请求 url 不会改变，仍为 /testRedirect
        - 重定向：客户端行为，重定向后，浏览器显示新的 url 地址。服务端回应 302 响应码，客户浏览器发现是302响应，
            则自动再发送一个新的http请求，请求url是新的 location 地址，如下 /index.jsp ，重定向行为是浏览器做了至少两次的访问请求。
     */
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");
        return "redirect:/index.jsp";
    }
}
