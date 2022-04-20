package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPathVariableController {

    @RequestMapping("/add/{a}/{b}")
    public String addition1(@PathVariable int a,@PathVariable int b){
        return "addition is "+(a+b);
    }

    @RequestMapping("/plus/{a}/{b}")
    public String addition2(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/addition/{a}/{b}")
    public int addition3(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return c;
    }

    @RequestMapping("/minus/{a}/{b}")
    public String subtract(@PathVariable int a,@PathVariable int b){
        return "subtraction is "+(a-b);
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String subtract1(@PathVariable int a,@PathVariable int b){
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/subtract/{a}/{b}")
    public int subtract2(@PathVariable int a,@PathVariable int b){
        int c=a-b;
        return c;
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public String multiply(@PathVariable int a,@PathVariable int b){
        return "multiplication is "+(a*b);
    }

    @RequestMapping("/multiply/{a}/{b}")
    public String multiply2(@PathVariable int a,@PathVariable int b){
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("/multiple/{a}/{b}")
    public int into(@PathVariable int a,@PathVariable int b){
        int c=a*b;
        return c;
    }
}
