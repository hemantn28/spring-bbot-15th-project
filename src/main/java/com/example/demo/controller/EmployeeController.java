package com.example.demo.controller;

import com.example.demo.controller.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //1.Create = add

    @RequestMapping("add_emp")
    public String add(){
        Employee emp= new Employee("Ramesh",7456,"Sales");
        employeeArrayList.add(emp);
        return "Employee added successfully...";
    }
    //2.Read = get

    @RequestMapping("/get_emplist")
    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    //3.Update

    @RequestMapping("/update_emp")
    public String update(){
        employeeArrayList.get(0).setName("Sonu");
        return "Name updated successfully";
    }
    //4.Delete
    
    @RequestMapping("/delete_emp")
    public String delete(){
        employeeArrayList.remove(0);
        return "Employee deleted successfully.";
    }


}
