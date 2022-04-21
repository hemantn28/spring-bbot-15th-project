package com.example.demo.controller;

import com.example.demo.controller.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    ArrayList<Student> studentArrayList=new ArrayList<>();

    // 1. Create => add

    @RequestMapping("/add_student")
    public String add(){
        Student student=new Student("Rohit",45,"IT");

        studentArrayList.add(student);
        return "student added successfully";
    }
    //2. Read => get

    @RequestMapping("/get_studentlist")
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    //3. Update
    @RequestMapping("/update_student")
    public String update(){
        studentArrayList.get(0).setName("Nitin");
        return "name updated successfully";
    }

    //4.Delete

    @RequestMapping("/delete_student")
    public String delete(){
        studentArrayList.remove(0);
        return "student deleted successfully";
    }
}
