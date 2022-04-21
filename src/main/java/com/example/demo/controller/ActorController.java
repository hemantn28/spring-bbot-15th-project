package com.example.demo.controller;

import com.example.demo.controller.model.Actor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ActorController {

    ArrayList<Actor> actorArrayList=new ArrayList<>();

    //1. Create =>

    @RequestMapping("/add_actor")
    public String add(){
        Actor actor=new Actor("Vivek Oberoi",45,"multi genre");
        Actor actor1=new Actor("Manoj Bajpai",50,"multi genre");
        actorArrayList.add(actor);
        actorArrayList.add(actor1);
        return "actors added successfully";
    }


    //2. Read => get

    @RequestMapping("/get_actorlist")
    public ArrayList<Actor> getActorArrayList() {
        return actorArrayList;
    }

    //3. Update

    @RequestMapping("/update_actor")
    public String update(){
        actorArrayList.get(1).setName("Rajpal Yadav");
        actorArrayList.get(1).setAge(50);
        actorArrayList.get(1).setSpeciality("comedy genre");

        return "name,age and speciality updated successfully.";
    }


    //4. Delete

    @RequestMapping("/delete_actor")
    public String delete(){
        actorArrayList.remove(0);
        return "actor deleted successfully";
    }
}
