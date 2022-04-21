package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/modern")
    public String request(@RequestParam String name){

        return "Welcome to Request Param "+name;
    }

    @RequestMapping("/my_marks")
    public String marks(@RequestParam int marks){
        if (marks>75){
            return "First division";
        }
        else{
            return "passed";
        }
    }

    @RequestMapping("/mySalary")
    public String checkSalary(@RequestParam int salary){
        if (salary>100000){
            return "Your package is high";
        }
        else if (salary>80000){
            return "your package is good";
        }
        else if (salary>60000){
            return "your package is average";
        }
        else{
            return "you are getting salary";
        }
    }
}
