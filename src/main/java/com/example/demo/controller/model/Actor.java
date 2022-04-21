package com.example.demo.controller.model;

import lombok.Data;

@Data
public class Actor {

    String name;
    int age;
    String speciality;

    public Actor(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }
}
