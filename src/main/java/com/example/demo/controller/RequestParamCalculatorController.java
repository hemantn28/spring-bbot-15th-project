package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamCalculatorController {

    @RequestMapping("/do_addition")
    public String addition4(@RequestParam int a,@RequestParam int b){
        return "addition is "+(a+b);
    }

    @RequestMapping("/twice_addition")
    public String addition5(@RequestParam int a,@RequestParam int b){
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/thrice_addition")
    public int addition6(@RequestParam int a,@RequestParam int b){
        int c=a+b;
        return c;
    }

    @RequestMapping("/do_subtraction")
    public String subtract4(@RequestParam int a,@RequestParam int b){
        return "addition is "+(a-b);
    }

    @RequestMapping("/twice_subtraction")
    public String subtract5(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return "subtraction is "+c;
    }

    @RequestMapping("/thrice_subtraction")
    public int subtract6(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return c;
    }

    @RequestMapping("/do_division")
    public String divide4(@RequestParam int a,@RequestParam int b){
        return "division is "+(a/b);
    }

    @RequestMapping("/twice_divide")
    public int divide5(@RequestParam int a,@RequestParam int b){
        int c=a/b;
        return c;
    }
}
