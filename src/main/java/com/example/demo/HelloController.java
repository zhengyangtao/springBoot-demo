package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author zhengyangtao
 * @create 2018-09-03 13:56
 */
//@RestController
@Controller
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    @RequestMapping("/hello")
    public String hello(){
        return name+age;
    }

    @RequestMapping("/hello2")
    public String hello2(Model m){
        m.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
}
