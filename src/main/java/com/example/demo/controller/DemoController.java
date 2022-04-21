package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping("/hello")
    public String message(){

        return "I am perfect in java";
    }

    @RequestMapping("/message")
    public String msg(){
        return "I am perfect in Spring boot";
    }

    @RequestMapping("/Java")
    public String messageMe(){
        return "Java,Spring boot,Microservices and cloud";
    }

    @RequestMapping("/num")
    public int returnInteger(){
        return 24;
    }

    @RequestMapping("/ ")
    public double yourSalary(){
        return 85634.52;
    }

}
