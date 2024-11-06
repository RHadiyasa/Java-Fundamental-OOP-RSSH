package com.rrsh.oop.object_interaction;

public class Lamp {
    private String condition = "Off"; // initial / default

    public void turnOn(){
        this.condition = "On";
    }

    public void turnOff(){
        this.condition = "Off";
    }

    public String getCondition() {
        return condition;
    }
}
