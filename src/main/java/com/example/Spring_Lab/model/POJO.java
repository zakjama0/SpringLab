package com.example.Spring_Lab.model;

public class POJO {

    private String name;

    private String timeOfDay;

    public POJO(){
    }

    public POJO(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
