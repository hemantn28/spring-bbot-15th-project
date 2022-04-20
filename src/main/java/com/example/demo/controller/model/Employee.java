package com.example.demo.controller.model;

import lombok.Data;

@Data
public class Employee {

    String name;
    int empId;
    String department;

    public Employee(String name, int empId, String department) {
        this.name = name;
        this.empId = empId;
        this.department = department;
    }
}
