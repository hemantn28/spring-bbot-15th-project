package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String addition(){
        int a=6;
        int b=4;
        return "addition is "+(a+b);
    }

    @RequestMapping("/minus")
    public String subtract(){
        int a=23;
        int b=12;
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/multiplication")
    public int multiply(){
        int a=12;
        int b=2;
        int c=a*b;
        return c;
    }

    @RequestMapping("/division")
    public String divide(){
        int a=28;
        int b=7;
        return "division is "+(a/b);
    }
}
