package com.example.demo.controller;

import com.example.demo.controller.model.Bike;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BikeController {

    ArrayList<Bike> bikeArrayList=new ArrayList<>();

    //1. Create => add
    @RequestMapping("/add_bike")
    public String add(){
        Bike bike=new Bike("Hero","Splendor",85000);
        Bike bike1=new Bike("Bajaj","Pulsar",165000);
        Bike bike2=new Bike("TVS","Apache",150000);
        Bike bike3=new Bike("Honda","Shine",90000);

        bikeArrayList.add(bike);
        bikeArrayList.add(bike1);
        bikeArrayList.add(bike2);
        bikeArrayList.add(bike3);

        return "bike added successfully";
    }

    //2. Read => get

    @RequestMapping("/get_bike")
    public ArrayList<Bike> getBikeArrayList() {
        return bikeArrayList;
    }

    //3.Update

    @RequestMapping("/update_bike")
    public String update(){
        bikeArrayList.get(2).setName("Royal Enfield");
        bikeArrayList.get(2).setModel("Classic");
        bikeArrayList.get(2).setPrice(198000);

        return "bike updated successfully";
    }


    //4. delete

    @RequestMapping("/delete_bike")
    public String delete(){
        bikeArrayList.remove(1);
        return "bike deleted successfully";
    }
}
