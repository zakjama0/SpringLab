package com.example.Spring_Lab.controller;

import com.example.Spring_Lab.model.POJO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class afternoonGreeting {
    @GetMapping("/afternoon") // we add '/greeting' to create a unique end point for this route
    public String greeting(){
        return "Good Afternoon Zak!";
    }

    @GetMapping
    public String newGame(){
     POJO pojo = new POJO("Zak","afternoon");
     return "Good " +pojo.getTimeOfDay()+ " " + pojo.getName();
    }
}
