package com.example.demo.controller.model;

import lombok.Data;

@Data
public class Student {
    String name;
    int rollNo;
    String section;

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
}
