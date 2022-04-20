package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {


    @RequestMapping("/message/{name}")
    public String myApp(@PathVariable String name){
        return "Welcome to Path Variable app "+name;
    }

    @RequestMapping("/trip/{city}")
    public String helloApp(@PathVariable String city){
        return "You are living in "+city;
    }

    @RequestMapping("/mobile/{place}")
    public String helloMe(@PathVariable String place){
        return "Are you going to "+place;
    }

    @RequestMapping("/your_age/{age}")
    public String checkAge(@PathVariable int age){
        if (age>19){
            return "You are an adult";
        }
        else if (age>13){
            return "You are a teenager";
        }
        else{
            return "You are a child";
        }
    }

    @RequestMapping("/my_salary/{salary}")
    public String checkSalary(@PathVariable int salary){
        if (salary>100000){
            return "Your package is very high";
        }
        else if (salary>80000){
            return "Your package is good";
        }
        else if (salary>50000){
            return "Your package is average";
        }
        else{
            return "Your package is moderate";
        }
    }

}
